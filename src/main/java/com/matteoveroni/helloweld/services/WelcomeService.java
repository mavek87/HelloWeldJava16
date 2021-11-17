package com.matteoveroni.helloweld.services;

import com.matteoveroni.helloweld.dto.User;
import jakarta.inject.Inject;

public class WelcomeService {
    private final GreetingPrinterService greetingPrinterService;

    @Inject
    public WelcomeService(GreetingPrinterService greetingPrinterService) {
        this.greetingPrinterService = greetingPrinterService;
    }

    public void welcomeMessage() {
        System.out.println("This is the welcome message");
    }

    public void welcomeUser(User user) {
        greetingPrinterService.greetUser(user);
    }
}
