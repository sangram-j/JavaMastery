package com.sj.demo.producer.controller;

import com.sj.demo.producer.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class EventController {
    @Autowired
    private KafkaMessagePublisher kafkaMessagePublisher;


    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable String message){
        try {
            kafkaMessagePublisher.sendMesageToTopic(message);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok("Message sent successfully!");
    }

}
