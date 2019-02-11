package com.lee;

//抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。
public interface IProductFactory {
    IProduct createProduct(String productCategory);
}
