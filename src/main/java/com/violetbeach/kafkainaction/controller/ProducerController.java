package com.violetbeach.kafkainaction.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @RequestMapping("/publish")
    public String publish(String message) {
        return "published a message :" + message;
    }
}
