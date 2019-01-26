package jdk.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK代理类,必须实现InvocationHandler的invoke()
 */
public class Jdk_HelloworlImplProxy implements InvocationHandler {

    //保存被代理的真实对象
    private Object target = null;

    /**
     * 保存真实对象，创建并返回代理对象
     * @param target 真实对象
     * @return
     */
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),  //被代理类的类加载器
                target.getClass().getInterfaces(),   //被代理类的所有接口类
                this);    //定义实现逻辑方法的拦截器代理类,必须实现的InvocationHandler的invoke方法,即代理逻辑方法
    }


    /**
     * 代理方法逻辑
     * @param proxy 代理对象
     * @param method 当前调用的方法
     * @param args 当前调用方法的参数
     * @return  代理返回结果
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理逻辑方法");
        System.out.println("调用真实对象之前");
        //反射方式调用真实对象, 第一个参数不能是proxy,否则死循环调用此类的invoke()
        Object result = method.invoke(target, args);
        System.out.println("调用真实对象之后");
        return result;
    }
}
