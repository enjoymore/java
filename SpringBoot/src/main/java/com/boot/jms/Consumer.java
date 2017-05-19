package com.boot.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by snlu on 2017/5/17.
 */
@Component
public class Consumer {
    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination="queue1")
    public void receiveQueue(String message){
        System.out.println(message);
    }
}
