package com.matteoveroni.helloweld.services;

import com.matteoveroni.helloweld.dto.User;

public class GreetingPrinterService {

    private static final String GREETING = "Hello";

    public void greetUser(User user) {
        System.out.println(GREETING + " " + user);
    }

}
