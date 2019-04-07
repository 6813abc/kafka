package com.cyg.kafka;

import com.cyg.kafka.kafakaTest.KafkaSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(KafkaApplication.class, args);
        KafkaSender sender = context.getBean(KafkaSender.class);
        for (int i = 0; i < 100; i++) {
            //调用消息发送类中的消息发送方法
            sender.send();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
