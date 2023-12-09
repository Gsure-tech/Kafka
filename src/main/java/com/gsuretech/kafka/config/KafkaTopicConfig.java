package com.gsuretech.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic gsuretechTopic(){
        return TopicBuilder.name("gsuretech")
                .build();
    }

    @Bean
    public NewTopic gsuretechJsonTopic(){
        return TopicBuilder.name("ENROLLMENT_RESPONSE-CREATE")
                .build();
    }
}
