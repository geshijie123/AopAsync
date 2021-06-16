package com.example.aopsync.controller;

import com.example.aopsync.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;
import java.util.UUID;

@RestController
public class DemoController {

    @Resource
    DemoService demoService;

    @RequestMapping("/")
    public Object funOne(){
        return  demoService.funOne(UUID.randomUUID().toString());
    }

}