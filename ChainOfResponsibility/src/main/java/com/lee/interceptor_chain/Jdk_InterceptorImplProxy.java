package com.lee.interceptor_chain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用jdk方式代理调用HelloworlImpl,通过反射生成拦截器对HelloworlImpl代理对象的调用进行过滤
 */
public class Jdk_InterceptorImplProxy implements InvocationHandler {

    private Object target;  //保存HelloworlImpl的真实对象
    private String interceptorClassName;  //拦截器全类名

    /**
     * 保存真实对象 和 拦截器全类名, 创建并返回代理对象
     *
     * @param target               真实对象
     * @param interceptorClassName 拦截器全类名
     * @return 代理对象
     */
    public Object bind(Object target, String interceptorClassName) {
        this.target = target;
        this.interceptorClassName = interceptorClassName;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);   //定义实现HelloworlImpl代理对象逻辑方法的代理类
    }

    /**
     * @param proxy  代理对象
     * @param method 当前调用的方法
     * @param args   当前调用方法的参数
     * @return 代理返回结果
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //没有设置拦截器
        if (interceptorClassName == null) {
            //直接反射调用HelloworlImpl真实对象的方法
            return method.invoke(target, args);
        }

        //有配置拦截器，执行拦截逻辑
        Object result = null;
        //通过反射创建拦截器
        Interceptor interceptor = (Interceptor) Class.forName(interceptorClassName).newInstance();
        //前置拦截放行
        if (interceptor.before(proxy, target, method, args)) {
            result = method.invoke(target, args);
        } else {  //被前置拦截
            //执行拦截器的around方法
            interceptor.around(proxy, target, method, args);
        }
        //执行后置拦截方法
        interceptor.after(proxy, target, method, args);

        return result;
    }
}
