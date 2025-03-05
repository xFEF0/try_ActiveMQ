package com.xfef0.tryActiveMQ.controller;

import com.xfef0.tryActiveMQ.message.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class MessageController {

    private final Producer producer;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        producer.sendMessage("test-queue", message);
        return ResponseEntity.ok("Message sent");
    }
}
