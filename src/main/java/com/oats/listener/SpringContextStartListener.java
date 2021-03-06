package com.oats.listener;

import com.oats.app.core.APPServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * 监听spring容器启动事件
 *
 * @author lvqun
 * @date 2019-07-14 23:16
 **/
@Slf4j
@Component
public class SpringContextStartListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private APPServer appServer;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log.info("springContext start ....");

        // 启动服务器
        appServer.start();
    }
}
