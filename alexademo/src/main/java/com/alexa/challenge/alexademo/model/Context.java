package com.alexa.challenge.alexademo.model;

public class Context {
    public Display Display;
    public System System;

    public System getSystem() {
        return System;
    }

    public void setSystem(System system) {
        this.System = system;
    }

    public com.alexa.challenge.alexademo.model.Display getDisplay() {
        return Display;
    }

    public void setDisplay(com.alexa.challenge.alexademo.model.Display display) {
        Display = display;
    }
}
