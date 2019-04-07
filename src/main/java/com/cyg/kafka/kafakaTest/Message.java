package com.cyg.kafka.kafakaTest;

import lombok.Data;

import java.util.Date;

/**
 * @author cyg
 * @date 2019/4/7 下午8:52
 **/
@Data
public class Message {

    //id
    private Long id;
    //消息
    private String msg;
    //时间戳
    private Date sendTime;
}
