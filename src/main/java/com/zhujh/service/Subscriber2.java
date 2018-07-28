package com.zhujh.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by sunlj on 18/7/28.
 * 订阅者
 */
@Service
public class Subscriber2
{
    @JmsListener(destination = "test.topic",containerFactory = "myJmsContainerFactory")
    public void subscribe(String text)
    {
        System.out.println("********<<<订阅者2 收到消息"+text);
    }
}
