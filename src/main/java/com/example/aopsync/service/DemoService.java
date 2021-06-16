package com.example.aopsync.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoService {
    public String funOne(String aa){

        log.info(Thread.currentThread().getId() +"  service ");
        return aa+"ok";
    }
}