package com.matteoveroni.helloweld;

import com.matteoveroni.helloweld.dto.User;
import com.matteoveroni.helloweld.services.WelcomeService;
import jakarta.inject.Inject;

public class App {

    private final WelcomeService welcomeService;
    private final User randomUser;

    @Inject
    public App(WelcomeService welcomeService, User randomUser) {
        this.welcomeService = welcomeService;
        this.randomUser = randomUser;
    }

    public void start() {
        welcomeService.welcomeMessage();

        System.out.println("Welcome fixed user created manually. This doesn't change");
        welcomeService.welcomeUser(new User("Samantha", 32));

        System.out.println("Welcome injected random user, created using a RandomUserProducer");
        welcomeService.welcomeUser(randomUser);
    }
}
