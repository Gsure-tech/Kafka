package com.gsuretech.kafka.controller;

import com.gsuretech.kafka.kafka.JsonKafkaProducer;
import com.gsuretech.kafka.payload.EventNotification;
import com.gsuretech.kafka.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;


    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
    @PostMapping("/publishEvent")
    public ResponseEntity<String> publishNotification(@RequestBody EventNotification eventNotification){
        kafkaProducer.sendEventNotification(eventNotification);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
}
