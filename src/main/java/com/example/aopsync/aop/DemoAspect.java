package com.example.aopsync.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class DemoAspect {
 

    @Pointcut("execution(public * com.example.aopsync.service..*.*(..))")
//    @Pointcut("execution(public * com.example.aopsync.service.DemoService.funOne(..))")
    public void logPointCut() {}


    @Before("logPointCut()")
    public void before(JoinPoint joinPoint){
        log.info(Thread.currentThread().getId() +"  Before ");

    }
    @After("logPointCut()")
    @Async
    public void after(JoinPoint joinPoint){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getId() +"  After ");
        System.out.println();
    }
}