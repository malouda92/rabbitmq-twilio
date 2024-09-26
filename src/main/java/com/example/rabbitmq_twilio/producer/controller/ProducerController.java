package com.example.rabbitmq_twilio.producer.controller;

import com.example.rabbitmq_twilio.model.Message;
import com.example.rabbitmq_twilio.producer.services.ProducerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerServiceImpl producerService;

    @GetMapping("/send")
    public ResponseEntity<Void> send(@RequestBody Message message) {
        producerService.send(message);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
