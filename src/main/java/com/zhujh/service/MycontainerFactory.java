package com.zhujh.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

/**
 * Created by sunlj on 18/7/28.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MycontainerFactory {
    @Bean(name = "myJmsContainerFactory")
    public JmsListenerContainerFactory getJmsListenerContainerFactory(ConnectionFactory connectionFactory){
        SimpleJmsListenerContainerFactory simpleJmsListenerContainerFactory=new
                SimpleJmsListenerContainerFactory();
        simpleJmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        simpleJmsListenerContainerFactory.setPubSubDomain(true);
        return  simpleJmsListenerContainerFactory;
    }
}
