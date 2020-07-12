package com.lee.listener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lsd
 * 2020-07-12 11:38
 */
public class EventSource {

    public final static String CLICK = "单击";
    public final static String DOUBLE_CLICK = "双击";

    private final List<EventListener> listeners = new ArrayList<>();


    /**
     * 注册监听器
     *
     * @param listener 事件监听器
     */
    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    /**
     * 发布事件，向所有监听器广播，每个事件监听器只会处理其关心的事件
     *
     * @param event 事件
     */
    public void publish(Event event) {
        for (EventListener listener : listeners) {
            listener.processEvent(event);
        }
    }


    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        eventSource.subscribe(new ClickEventListener());
        eventSource.subscribe(new DoubleClickEventListener());
        eventSource.publish(new Event(CLICK));
        eventSource.publish(new Event(DOUBLE_CLICK));
    }

}
