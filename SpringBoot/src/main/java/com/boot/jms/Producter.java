package com.boot.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.jms.Queue;

/**
 * Created by snlu on 2017/5/17.
 */
@Component
public class Producter {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void send(String message){
        jmsMessagingTemplate.convertAndSend(queue, message);
    }
}
