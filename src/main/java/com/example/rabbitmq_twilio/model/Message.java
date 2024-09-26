package com.example.rabbitmq_twilio.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Message implements Serializable {
    private String phoneNumber;
    private String message;
}
