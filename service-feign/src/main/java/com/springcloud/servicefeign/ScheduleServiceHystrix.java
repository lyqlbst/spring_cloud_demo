package com.springcloud.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHystrix implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name;
    }
}
