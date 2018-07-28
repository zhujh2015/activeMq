package com.zhujh.service;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * Created by sunlj on 18/7/28.
 * 生产者--消费者模式 --1对1
 */
@Service
public class Producer
{
    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMsg(String destinationName,String message)
    {
        System.out.println("****************>>>  发送队列消息:"+message);

        Destination destination=new ActiveMQQueue(destinationName);

        jmsMessagingTemplate.convertAndSend(destination,message);

    }
}
