package com.alexa.challenge.alexademo.model;

public class Device {
    public String deviceId;
    public SupportedInterfaces supportedInterfaces;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public SupportedInterfaces getSupportedInterfaces() {
        return supportedInterfaces;
    }

    public void setSupportedInterfaces(SupportedInterfaces supportedInterfaces) {
        this.supportedInterfaces = supportedInterfaces;
    }
}
