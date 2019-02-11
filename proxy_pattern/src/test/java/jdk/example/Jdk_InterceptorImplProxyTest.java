package jdk.example;

import jdk.example1_interceptor.Jdk_InterceptorImplProxy;
import jdk.helloworld.HelloWorld;
import jdk.helloworld.HelloworlImpl;
import org.junit.Test;

public class Jdk_InterceptorImplProxyTest {

    //反射实现的拦截器全类名
    private static final String interceptorClassName = "jdk.example1_interceptor.InterceptorImpl";

    @Test
    public void test() {
        Jdk_InterceptorImplProxy jdk = new Jdk_InterceptorImplProxy();
        //代理HelloworlImpl 并 配置拦截器
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloworlImpl(), interceptorClassName);
        proxy.sayhello();
    }

}