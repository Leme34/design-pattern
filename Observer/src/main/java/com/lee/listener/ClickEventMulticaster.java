package com.lee.listener;

/**
 * Created by lsd
 * 2020-08-08 08:51
 */
public class ClickEventMulticaster extends AbstractEventMulticaster {
    @Override
    public void doStart() {
        System.out.println("单击事件处理前...");
    }

    @Override
    public void doEnd() {
        System.out.println("单击事件处理后...");
    }
}
