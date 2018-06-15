package com.springcloud.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private ScheduleServiceHi scheduleServiceHi;

    @RequestMapping("hi")
    public String sayHi(@RequestParam String name) {
        return "feign:" + scheduleServiceHi.sayHiFromClientOne(name);
    }
}
