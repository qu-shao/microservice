package com.example.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-provider")
@Service
@Component
public interface ConsumerService {

    @GetMapping("test/getName")
    public String getName();
}
