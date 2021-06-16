package com.example.aopsync;

import cn.hutool.http.HttpUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

//@SpringBootTest
class AopSyncApplicationTests {

    @Test
    void contextLoads() {
        IntStream.range(0,4).parallel().forEach(one->{

            HttpUtil.get("127.0.0.1");

        });
    }

}
