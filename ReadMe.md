一、proxy_pattern 动态代理 
    1、JDK动态代理是利用反射机制生成一个实现代理接口的匿名类，在调用具体方法前调用InvokeHandler来处理。
    2、CGlib动态代理是利用asm开源包，对代理对象类的class文件加载进来，通过修改其字节码生成子类来处理。

二、ChainOfResponsibility 责任链模式

三、Observer 观察者模式

四、SimpleFactory 简单工厂模式

五、AbstractFactory 抽象工厂模式

六、Builder 建造者模式
