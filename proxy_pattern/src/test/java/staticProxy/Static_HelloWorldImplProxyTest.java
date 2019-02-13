package staticProxy;

import org.junit.Test;

public class Static_HelloWorldImplProxyTest {

    @Test
    public void test(){
        Static_HelloWorldImplProxy proxy = new Static_HelloWorldImplProxy();
        proxy.sayhello();
    }

}