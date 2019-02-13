package CGlib;

import jdk.helloworld.HelloworldImpl;
import org.junit.Test;

public class CGlibProxyTest {

    @Test
    public void CGlibProxyTest(){
        //1、创建代理对象
        CGlib_HelloworldImplProxy cglib = new CGlib_HelloworldImplProxy();
        //2、cglib自动创建子类代理对象
        HelloworldImpl proxy = (HelloworldImpl) cglib.getProxy(HelloworldImpl.class);
        //3、通过代理对象调用方法
        proxy.sayhello();
    }

}