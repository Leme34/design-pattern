package CGlib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * CGlib代理类,必须实现MethodInterceptor的intercept()
 */
public class CGlib_HelloworldImplProxy implements MethodInterceptor {

    /**
     * 创建代理对象
     * @param clazz 传入被代理对象类型
     * @return 返回创建出来的CGlib代理对象
     */
    public Object getProxy(Class clazz){
        Enhancer enhancer = new Enhancer();
        //设置被代理类对象的父类
        enhancer.setSuperclass(clazz);
        //回调当前类实现的MethodInterceptor的intercept()
        enhancer.setCallback(this);
        //创建并返回代理对象
        return enhancer.create();
    }


    /**
     * 代理逻辑
     * @param proxy 代理对象
     * @param method 当前调用的方法
     * @param args 当前调用方法的参数
     * @param methodProxy 当前调用方法的代理
     * @return 代理返回结果
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("进入代理逻辑方法");
        System.out.println("调用真实对象之前");
        //方法代理的反射方式调用真实对象, 不能调用invoke否则死循环,因为CGlib自动创建子类代理对象,父类才是真实对象
        Object result = methodProxy.invokeSuper(proxy, args);
        System.out.println("调用真实对象之后");
        return result;
    }
}
