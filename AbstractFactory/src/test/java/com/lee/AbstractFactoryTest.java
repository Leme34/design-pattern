package com.lee;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void test(){
        ProductFactory productFactory = new ProductFactory();
        productFactory.createProduct("1").showMsg();
        productFactory.createProduct("2").showMsg();
        productFactory.createProduct("3").showMsg();
    }

}