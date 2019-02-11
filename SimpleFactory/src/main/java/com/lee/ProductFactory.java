package com.lee;

//工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑，根据逻辑不同，产生具体的工厂产品。
public class ProductFactory {

    public static IProduct createProduct(String productCategory) {
        switch (productCategory) {
            case "1": return new Product1();
            case "2": return new Product2();
            case "3": return new Product3();
            default: throw new RuntimeException("没有此类型的产品!");
        }
    }

}
