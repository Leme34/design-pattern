package jdk.example;

import java.lang.reflect.Method;

public class InterceptorImpl implements Interceptor{
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("调用反射方法前");
        return false;
    }

    @Override
    public boolean around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("我是around方法");
        return false;
    }

    @Override
    public boolean after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("调用反射方法后");
        return false;
    }
}
