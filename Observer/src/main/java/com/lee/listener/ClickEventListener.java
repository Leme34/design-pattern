package com.lee.listener;

/**
 * Created by lsd
 * 2020-07-12 11:39
 */
public class ClickEventListener implements EventListener {
    @Override
    public void processEvent(Event event) {
        if (EventSource.CLICK.equals(event.getName())) {
            System.out.println("处理单击事件...");
        }
    }
}
