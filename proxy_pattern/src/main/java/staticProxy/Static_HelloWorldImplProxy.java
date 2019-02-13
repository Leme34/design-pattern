package staticProxy;

/**
 * 静态代理
 * 特点：
 *   1. 目标对象必须要实现接口
 *   2. 代理对象，要实现与目标对象一样的接口
 */
public class Static_HelloWorldImplProxy implements HelloWorld{

    // 代理对象，需要维护一个目标对象
    HelloWorld target = new HelloworldImpl();

    // 实现与目标对象一样的接口
    @Override
    public void sayhello() {
        System.out.println("进入代理逻辑方法");
        System.out.println("调用真实对象之前");
        target.sayhello();
        System.out.println("调用真实对象之后");
    }

}
