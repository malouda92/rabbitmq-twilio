package com.example.rabbitmq_twilio.twilio;

import com.example.rabbitmq_twilio.config.MessagingTwilioConf;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendSmsServiceImpl implements SendSmsService {

    private final MessagingTwilioConf messagingTwilioConf;
    @Override
    public Message send(String phoneNumber, String message) {
        Twilio.init(messagingTwilioConf.getAccountSid(), messagingTwilioConf.getAuthToken());
        return Message.creator(
                        new com.twilio.type.PhoneNumber(phoneNumber),
                        new com.twilio.type.PhoneNumber(messagingTwilioConf.getPhoneNumber()),
                        message)
                .create();
    }
}