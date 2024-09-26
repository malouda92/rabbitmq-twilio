package com.example.rabbitmq_twilio.producer.services;

import com.example.rabbitmq_twilio.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService{

    private final AmqpTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.routingkey}")
    private String routingkey;

    @Override
    public void send(Message message) {
        rabbitTemplate.convertAndSend(exchange, routingkey, message);
    }
}
