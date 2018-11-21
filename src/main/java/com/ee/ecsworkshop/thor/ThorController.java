package com.ee.ecsworkshop.thor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ThorController {
    private static final String message = "You’re big. I’ve fought bigger.";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/thunder")
    public ServiceMessage message() {
        return new ServiceMessage(counter.incrementAndGet(), message);
    }
}
