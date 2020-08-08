package com.lee.listener;

/**
 * Created by lsd
 * 2020-07-12 11:39
 */
public class DoubleClickEventListener implements EventListener {
    @Override
    public void processEvent(Event event) {
        if (AbstractEventMulticaster.DOUBLE_CLICK.equals(event.getName())) {
            System.out.println("处理双击事件...");
        }
    }
}
