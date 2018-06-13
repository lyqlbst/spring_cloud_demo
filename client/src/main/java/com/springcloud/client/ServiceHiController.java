package com.springcloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceHiController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("hi")
    public String home(@RequestParam String name) {
        return "Hi" + name + ",I am from port:" + port;
    }
}
