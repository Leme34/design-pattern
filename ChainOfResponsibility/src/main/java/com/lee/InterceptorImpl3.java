package com.lee;

import java.lang.reflect.Method;

public class InterceptorImpl3 implements Interceptor{

    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器3】调用反射方法前");
        return true;    //不拦截
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器3】我是around方法");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器3】调用反射方法后");
    }
}
