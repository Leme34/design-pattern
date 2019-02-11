package com.lee;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 被观察的产品列表接口
 */
public class ProductList extends Observable {

    private List<String> productList = null;  //产品列表

    private static ProductList instance;

    private ProductList(){}   //构造方法私有化

    /**
     * 创建单实例对象
     * @return 产品列表唯一实例
     */
    public static ProductList getInstance(){
        if(instance==null){
            instance = new ProductList();
            instance.productList = new ArrayList<>();
        }
        return instance;
    }

    /**
     * 增加观察者
     * @param observer java提供的 观察者类(Observer) 对象
     */
    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    /**
     * 往产品列表新增产品
     */
    public void addProduct(String newProduct){
        productList.add(newProduct);
        System.out.println("产品列表新增了产品："+newProduct);
        //设置被观察对象已发生变化
        this.setChanged();
        //通知所有观察者,并传递信息（产品）
        this.notifyObservers(newProduct);
    }


}
