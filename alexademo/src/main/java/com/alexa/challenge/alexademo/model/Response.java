package com.alexa.challenge.alexademo.model;

import java.util.List;

public class Response {

    public OutputSpeech outputSpeech;
    public Card card;
    public Reprompt reprompt;
    public List<Directives> directives;
    public boolean shouldEndSession;

    public OutputSpeech getOutputSpeech() {
        return outputSpeech;
    }

    public void setOutputSpeech(OutputSpeech outputSpeech) {
        this.outputSpeech = outputSpeech;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Reprompt getReprompt() {
        return reprompt;
    }

    public void setReprompt(Reprompt reprompt) {
        this.reprompt = reprompt;
    }

    public List<Directives> getDirectives() {
        return directives;
    }

    public void setDirectives(List<Directives> directives) {
        this.directives = directives;
    }

    public boolean isShouldEndSession() {
        return shouldEndSession;
    }

    public void setShouldEndSession(boolean shouldEndSession) {
        this.shouldEndSession = shouldEndSession;
    }
}
