package com.oats.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * 监听spring容器关闭事件
 *
 * @author lvqun
 * @date 2019-07-14 23:17
 **/
public class SpringContextCloseListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        System.out.println("SpringContext close ....");
    }
}
