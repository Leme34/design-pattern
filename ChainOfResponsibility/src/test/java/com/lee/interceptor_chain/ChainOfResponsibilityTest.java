package com.lee.interceptor_chain;

import org.junit.Test;

public class ChainOfResponsibilityTest {

    private static final String interceptor1 = "com.lee.interceptor_chain.InterceptorImpl1";
    private static final String interceptor2 = "com.lee.interceptor_chain.InterceptorImpl2";
    private static final String interceptor3 = "com.lee.interceptor_chain.InterceptorImpl3";

    @Test
    public void testInterceptorChain() {
        Jdk_InterceptorImplProxy jdk1 = new Jdk_InterceptorImplProxy();
        Jdk_InterceptorImplProxy jdk2 = new Jdk_InterceptorImplProxy();
        Jdk_InterceptorImplProxy jdk3 = new Jdk_InterceptorImplProxy();
        HelloWorld proxy1 = (HelloWorld) jdk1.bind(new HelloworldImpl(), interceptor1);
        //构造顺序的拦截器链,拦截顺序: interceptor3 -> interceptor2 -> interceptor1
        HelloWorld proxy2 = (HelloWorld) jdk2.bind(proxy1, interceptor2);  //嵌套代理proxy1
        HelloWorld proxy3 = (HelloWorld) jdk3.bind(proxy2, interceptor3);  //嵌套代理proxy2
        proxy3.sayhello();                                                 //调用拦截器链
    }


}
