package com.sj.demo.producer.service;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void sendMesageToTopic(String message){
        CompletableFuture<SendResult<String, Object>> kafkaTest = kafkaTemplate.send("kafka_test", message);
        kafkaTest.whenComplete((result , ex )-> {
            if(ex!=null){
                System.out.println("Error sending message to Kafka: " + ex.getMessage());
            }else{
                System.out.println("Message sent to Kafka successfully : - Offset :- "+result.getRecordMetadata().offset()
                        + " " +  "Partitian :- " +result.getRecordMetadata().partition());
            }
        });
    }
}
