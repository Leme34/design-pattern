package com.lee;

//具体产品角色：具体工厂角色所创建的对象就是此角色的实例。
public class Product2 implements IProduct{
    @Override
    public void showMsg() {
        System.out.println("i am Product2");
    }
}