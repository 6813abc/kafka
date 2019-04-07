package com.cyg.kafka.kafakaTest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @author cyg
 * @date 2019/4/7 下午8:52
 **/
@Component
@Slf4j
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private Gson gson = new GsonBuilder().create();

    //发送消息方法
    public void send() {
        Message message = new Message();
        message.setId(System.currentTimeMillis());
        message.setMsg(new Random().ints(0, 100) + "哈哈");
        message.setSendTime(new Date());
        kafkaTemplate.send("cyg", gson.toJson(message));
    }
}
