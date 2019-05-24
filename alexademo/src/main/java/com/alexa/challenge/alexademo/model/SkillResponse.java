package com.alexa.challenge.alexademo.model;

public class SkillResponse {
    public String version;
    public SessionAttributes sessionAttributes;
    public Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SessionAttributes getSessionAttributes() {
        return sessionAttributes;
    }

    public void setSessionAttributes(SessionAttributes sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }
}
