package com.jeremyliao.lebapp.event;

import com.jeremyliao.liveeventbus.core.EventType;

/**
 * Created by liaohailiang on 2020-05-29.
 */
public class DemoEventType implements EventType {
    public final String content;

    public DemoEventType(String content) {
        this.content = content;
    }
}
