package com.umang.togadiya.springbootmaven.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

    @Scheduled(initialDelayString = "5000", fixedDelayString = "8000")
    public void keepConnectionsAlive() {
        System.out.println("Called At :");
    }
}
