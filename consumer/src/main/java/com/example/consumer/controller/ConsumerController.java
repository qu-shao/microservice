package com.example.consumer.controller;

import com.example.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("consumer")
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("getName")
    public String getName(){
        return consumerService.getName();
    }
}


