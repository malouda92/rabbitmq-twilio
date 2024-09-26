package com.example.rabbitmq_twilio.producer.services;

import com.example.rabbitmq_twilio.model.Message;

public interface ProducerService {
    void send(Message message);
}
