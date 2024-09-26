package com.example.rabbitmq_twilio.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(value = "messaging.twilio")
public class MessagingTwilioConf {
    private String accountSid;
    private String authToken;
    private String phoneNumber;
}
