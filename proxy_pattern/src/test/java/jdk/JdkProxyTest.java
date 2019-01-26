package jdk;

import jdk.helloworld.HelloWorld;
import jdk.helloworld.HelloworlImpl;
import jdk.helloworld.Jdk_HelloworlImplProxy;
import org.junit.Test;


public class JdkProxyTest {

    @Test
    public void jdkProxyTest(){
        //1、创建代理对象
        Jdk_HelloworlImplProxy jdk = new Jdk_HelloworlImplProxy();
        //2、绑定并返回代理对象
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloworlImpl());
        //3、通过代理对象调用方法
        proxy.sayhello();
    }


}