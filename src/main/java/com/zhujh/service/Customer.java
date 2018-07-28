package com.zhujh.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by sunlj on 18/7/28.
 *  消费者
 */
@Service
public class Customer {


    @JmsListener(destination = "test.queue")
   public void receiveMsg(String text)
   {
       System.out.println("*************<<< 消费者1 收到消息"+text);
   }
}
