package com.lee;

// 客户端使用的统一工厂：只需要指定产品的类型，无需知道具体工厂规则
public class ProductFactory implements IProductFactory {

    public IProduct createProduct(String productCategory) {
        IProductFactory productFactory;
        //根据客户指定产品的类型，调用具体工厂生产产品
        switch (productCategory) {
            case "1": productFactory = new ProductFactory1(); break;
            case "2": productFactory = new ProductFactory2(); break;
            case "3": productFactory = new ProductFactory3(); break;
            default: throw new RuntimeException("没有此类型的产品!");
        }
        if (productFactory != null) {
            return productFactory.createProduct(productCategory);
        }
        return null;
    }

}
