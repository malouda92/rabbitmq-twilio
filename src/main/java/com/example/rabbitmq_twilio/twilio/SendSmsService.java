package com.example.rabbitmq_twilio.twilio;

import com.twilio.rest.api.v2010.account.Message;

public interface SendSmsService {
    Message send(String phoneNumber, String message);
}
