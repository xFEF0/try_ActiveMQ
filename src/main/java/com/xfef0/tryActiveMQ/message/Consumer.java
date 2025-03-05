package com.xfef0.tryActiveMQ.message;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Consumer {

    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

    @JmsListener(destination = "test-queue")
    public void receiveMessage(String message) {
        log.info("test-queue received message: {}", message);
    }

}
