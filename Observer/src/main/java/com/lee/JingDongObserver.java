package com.lee;

import java.util.Observable;
import java.util.Observer;

/**
 * 京东电商的接口
 */
public class JingDongObserver implements Observer {

    @Override
    public void update(Observable o, Object product) {
        String newProduct = (String) product;
        System.out.println("新产品【"+newProduct+"】已同步到 京东 商城");
    }
}
