package jdk.example;

import jdk.helloworld.HelloWorld;
import jdk.helloworld.HelloworlImpl;
import org.junit.Test;

public class Jdk_InterceptorImplProxyTest {

    @Test
    public void test() {
        Jdk_InterceptorImplProxy jdk = new Jdk_InterceptorImplProxy();
        //代理HelloworlImpl 并 配置拦截器
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloworlImpl(), "jdk.example.InterceptorImpl");
        proxy.sayhello();
    }

}