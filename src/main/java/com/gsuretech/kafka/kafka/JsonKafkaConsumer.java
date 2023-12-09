package com.gsuretech.kafka.kafka;

import com.gsuretech.kafka.payload.EventNotification;
import com.gsuretech.kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

   // @KafkaListener(topics = "gsuretech_json", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message received -> %s", user.toString()));
    }

    @KafkaListener(topics = "ENROLLMENT_RESPONSE-CREATE-3", groupId = "enrollment")
    public void consume(EventNotification eventNotification){
        LOGGER.info(String.format("Json message received -> %s", eventNotification.toString()));
    }
}
