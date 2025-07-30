package com.example.kafkademo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.kafkademo.service.KafkaProducerService;

@RestController
public class MessageController {

    private final KafkaProducerService producerService;

    public MessageController(KafkaProducerService producerService){
        this.producerService = producerService;
    }

    @RequestMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka: " + message;
    }
}
