package com.lee.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 淘宝电商的接口
 */
public class TaoBaoObserver implements Observer {

    @Override
    public void update(Observable o, Object product) {
        String newProduct = (String) product;
        System.out.println("新产品【"+newProduct+"】已同步到 淘宝 商城");
    }
}
