package com.alexa.challenge.alexademo.model.Paycode;

public class PaycodeResponse {
    public String subscriberId;
    public String psyWithMobileToken;
    public String tokenLifeInMinutes;

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getPsyWithMobileToken() {
        return psyWithMobileToken;
    }

    public void setPsyWithMobileToken(String psyWithMobileToken) {
        this.psyWithMobileToken = psyWithMobileToken;
    }

    public String getTokenLifeInMinutes() {
        return tokenLifeInMinutes;
    }

    public void setTokenLifeInMinutes(String tokenLifeInMinutes) {
        this.tokenLifeInMinutes = tokenLifeInMinutes;
    }
}
