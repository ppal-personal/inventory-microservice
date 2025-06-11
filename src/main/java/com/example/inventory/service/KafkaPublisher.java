package com.example.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublisher {

    private static final String TOPIC = "inventory-events";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publish(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}