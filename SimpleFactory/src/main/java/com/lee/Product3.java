package com.lee;

//具体产品角色：工厂类所创建的对象就是此角色的实例。
public class Product3 implements IProduct{
    @Override
    public void showMsg() {
        System.out.println("i am Product3");
    }
}