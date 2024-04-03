package com.umang.togadiya.springbootmaven.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    private boolean isCacheInitialized = false;

    // Implement the logic to check if cache is initialized
    private boolean isCacheInitialized() {
        System.out.println("Before Server");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            // Handle error
        }
        System.out.println("after 10 sec Inti");
        setCacheInitialized(true);
        return isCacheInitialized;
    }

    // Method to set cache initialized status
    public void setCacheInitialized(boolean initialized) {
        this.isCacheInitialized = initialized;
    }

    @Override
    public Health health() {
        if (isCacheInitialized()) {
            System.out.println("Up");
            return Health.up().build(); // Application is ready
        } else {
            System.out.println("Down");
            return Health.down().build(); // Application is not ready
        }
    }
}
