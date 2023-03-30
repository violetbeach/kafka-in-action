package com.violetbeach.kafkainaction.controller;

import com.violetbeach.kafkainaction.KafkaProduceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final KafkaProduceService kafkaProduceService;

    @RequestMapping("/publish")
    public String publish(String message) {
        kafkaProduceService.send(message);
        return "published a message :" + message;
    }

    @RequestMapping("/publish-callback")
    public String publishWithCallback(String message) throws ExecutionException, InterruptedException {
        kafkaProduceService.sendWithCallback(message);
        return "published a message :" + message;
    }
}
