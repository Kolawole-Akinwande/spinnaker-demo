package com.alexa.challenge.alexademo.model;

public class OutputSpeech {
    public String type;
    public String text;
    public String ssml;
    public String playBehavior;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSsml() {
        return ssml;
    }

    public void setSsml(String ssml) {
        this.ssml = ssml;
    }

    public String getPlayBehavior() {
        return playBehavior;
    }

    public void setPlayBehavior(String playBehavior) {
        this.playBehavior = playBehavior;
    }
}
