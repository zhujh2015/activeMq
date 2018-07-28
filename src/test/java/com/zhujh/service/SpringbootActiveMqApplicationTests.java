package com.zhujh.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootActiveMqApplicationTests {

	@Resource
	private Producer producer;
	@Resource
	private Publisher publisher;

	/*点对点模式*/
	@Test
	public void contextLoads() {

		for (int i=0;i<10;i++)
		{
			producer.sendMsg("test.queue","消息队列:消息---"+i);

			/* 发送消息队列头部和 接受消息头部一致 则可以通过监听直接消费*/
		}
	}

	/*发布订阅者模式*/
	@Test
	public void subscriberTwo()
	{
		for (int i=0;i<10;i++) {
			publisher.publish("test.topic", "Topic Meg 发布消息" + i);
		}
	}

}
