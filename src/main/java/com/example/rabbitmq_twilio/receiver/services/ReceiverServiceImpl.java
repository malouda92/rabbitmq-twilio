package com.example.rabbitmq_twilio.receiver.services;

import com.example.rabbitmq_twilio.model.Message;
import com.example.rabbitmq_twilio.twilio.SendSmsService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReceiverServiceImpl {

    private final SendSmsService sendSmsService;

    @RabbitListener(queues = {"${spring.rabbitmq.queue}"})
    public void consume(Message message) {
        sendSmsService.send(message.getPhoneNumber(), message.getMessage());
    }
}
