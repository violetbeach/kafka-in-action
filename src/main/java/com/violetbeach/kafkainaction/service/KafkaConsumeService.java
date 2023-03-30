package com.violetbeach.kafkainaction.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumeService {
    private static final String TOPIC_NAME = "topic5";
    private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = TOPIC_NAME)
    public void listenMessage(String jsonMessage) {
        try {
            MessageObject message = objectMapper.readValue(jsonMessage, MessageObject.class);
            System.out.println(">>>" + message.getName() + "," + message.getMessage());
        } catch (Exception ignore) {}
    }
}
