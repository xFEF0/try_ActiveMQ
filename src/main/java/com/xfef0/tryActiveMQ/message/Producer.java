package com.xfef0.tryActiveMQ.message;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class Producer {

    private static final Logger log = LoggerFactory.getLogger(Producer.class);

    private final JmsTemplate jmsTemplate;

    public void sendMessage(String destination, String message) {
        jmsTemplate.convertAndSend(destination, message);
        log.info("Message {} sent to {}.", message, destination);
    }

}
