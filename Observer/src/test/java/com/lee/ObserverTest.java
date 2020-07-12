package com.lee;

import com.lee.jdk.JingDongObserver;
import com.lee.jdk.ProductList;
import com.lee.jdk.TaoBaoObserver;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void test(){
        ProductList observable = ProductList.getInstance();
        TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
        JingDongObserver jingDongObserver = new JingDongObserver();
        observable.addObserver(jingDongObserver);
        observable.addObserver(taoBaoObserver);
        //新增产品
        observable.addProduct("产品1");
        observable.addProduct("产品2");
    }

}
