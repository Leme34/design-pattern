package CGlib;

import jdk.helloworld.HelloworlImpl;
import org.junit.Test;

public class CGlibProxyTest {

    @Test
    public void CGlibProxyTest(){
        //1、创建代理对象
        CGlib_HelloworlImplProxy cglib = new CGlib_HelloworlImplProxy();
        //2、cglib自动创建子类代理对象
        HelloworlImpl proxy = (HelloworlImpl) cglib.getProxy(HelloworlImpl.class);
        //3、通过代理对象调用方法
        proxy.sayhello();
    }

}