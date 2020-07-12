一、proxy_pattern 代理模式  
    1、静态代理：只能代理固定接口实现类  
    2、动态代理：绑定指定的接口实现类后，就能代理它  
      1）JDK动态代理是利用反射机制生成一个**实现**代理接口的匿名类，在调用具体方法前调用InvokeHandler来处理。  
      2）CGlib动态代理是利用asm开源包，加载代理目标类（不能为final修饰,因为final修饰的类不能被继承）的class文件，通过修改其字节码生成子类来处理。  
         以动态生成的子类**继承**目标的方式实现，在运行期动态的在内存中构建一个子类。  

二、ChainOfResponsibility 责任链模式

三、Observer 观察者模式

四、SimpleFactory 简单工厂模式

五、AbstractFactory 抽象工厂模式

六、Builder 建造者模式
