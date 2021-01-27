package com.m.stream.receive;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName MessageSendController
 * @Description:
 * @Author: mxw
 * @Create: 2021-01-19 21:23
 */
@Component
@RequestMapping("/message")
@EnableBinding(Sink.class)
@Slf4j
public class MessageReceiveController {

//    receive

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void receiveMessage(Message<String> message) {
        log.info("消费者1接收消息---> {}, 端口: {}", message.getPayload(), serverPort);
    }
}
