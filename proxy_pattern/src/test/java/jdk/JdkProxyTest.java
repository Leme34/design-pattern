package jdk;

import jdk.helloworld.HelloWorld;
import jdk.helloworld.HelloworldImpl;
import jdk.helloworld.Jdk_HelloworldImplProxy;
import org.junit.Test;


public class JdkProxyTest {

    @Test
    public void jdkProxyTest(){
        //1、创建代理对象
        Jdk_HelloworldImplProxy jdk = new Jdk_HelloworldImplProxy();
        //2、绑定并返回代理对象
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloworldImpl());
        //3、通过代理对象调用方法
        proxy.sayhello();
    }


}