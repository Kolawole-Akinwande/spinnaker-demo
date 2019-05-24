package com.alexa.challenge.alexademo.model;

public class Intent {
    public String name;
    public String confirmationStatus;
    public Slots slots;

    public Slots getSlots() {
        return slots;
    }

    public void setSlots(Slots slots) {
        this.slots = slots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfirmationStatus() {
        return confirmationStatus;
    }

    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }
}
