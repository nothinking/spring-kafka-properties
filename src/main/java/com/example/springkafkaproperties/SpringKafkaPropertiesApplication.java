package com.example.springkafkaproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@EnableKafka
@SpringBootApplication
public class SpringKafkaPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaPropertiesApplication.class, args);
    }

    @Autowired
    private KafkaTemplate<String, Greeting> kafkaTemplate;

    @KafkaListener(topics = "topic1")
    private void listener(Greeting msg) {
        System.out.println(msg);
        this.kafkaTemplate.send("topic2", msg);
    }

}
