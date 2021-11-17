package com.matteoveroni.helloweld;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class EntryPoint {

    public static void main(String[] args) {
        WeldContainer container = new Weld()
                .disableDiscovery()
                .addPackages(true, EntryPoint.class)
                .initialize();

        App app = container.select(App.class).get();
        app.start();
    }
}