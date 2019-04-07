package com.cyg.kafka.kafakaTest;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author cyg
 * @date 2019/4/7 下午8:53
 **/
@Component
@Slf4j
public class KafkaReceiver {

    @KafkaListener(topics = {"cyg"})
    public void receiveMessage(String message){
        //收到通道的消息之后执行秒杀操作
        System.out.println(message);
    }
}