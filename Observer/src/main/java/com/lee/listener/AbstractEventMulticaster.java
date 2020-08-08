package com.lee.listener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lsd
 * 2020-07-12 11:38
 */
public abstract class AbstractEventMulticaster {

    public final static String CLICK = "单击";
    public final static String DOUBLE_CLICK = "双击";

    private final List<EventListener> listeners = new ArrayList<>();

    public abstract void doStart();

    public abstract void doEnd();

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
    public void multicastEvent(Event event) {
        //模板方法设计模式
        doStart();
        for (EventListener listener : listeners) {
            listener.processEvent(event);
        }
        doEnd();
    }


    public static void main(String[] args) {
        AbstractEventMulticaster clickEventMulticaster = new ClickEventMulticaster();
        clickEventMulticaster.subscribe(new ClickEventListener());
        clickEventMulticaster.multicastEvent(new Event(CLICK));

        AbstractEventMulticaster doubleClickEventMulticaster = new DoubleClickEventMulticaster();
        doubleClickEventMulticaster.subscribe(new DoubleClickEventListener());
        doubleClickEventMulticaster.multicastEvent(new Event(DOUBLE_CLICK));
    }

}
