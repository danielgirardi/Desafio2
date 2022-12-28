package com.south.stockmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqService {

    @Autowired
    private RabbitTenplate rabbitTemplate;

    public void enviaMensagem (String nomeFila, Object mensagem){
        this.rabbitTemplate.convertAndSend(nomeFila, mensagem);
    }
}
