package com.m.stream.receive;

import com.m.stream.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName MessageSendController
 * @Description:
 * @Author: mxw
 * @Create: 2021-01-19 21:23
 */
@RestController
@RequestMapping("/message")
public class MessageSendController {

    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping("/send")
    public String sendMessage() {
        return iMessageProvider.send();
    }
}
