package com.gdut.activemqcluster;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class QueueConsumer {

    @JmsListener(destination = "${queuename}")
    public void receive(TextMessage textMessage) throws JMSException {
        System.out.println("收到消息：" + textMessage.getText());
    }
}
