package com.lee;

//具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象
public class ProductFactory3 implements IProductFactory{
    @Override
    public IProduct createProduct(String productCategory) {
        return new Product3();
    }
}
