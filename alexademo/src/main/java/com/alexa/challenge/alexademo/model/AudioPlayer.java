package com.alexa.challenge.alexademo.model;

public class AudioPlayer {
    public String playerActivity;
    public String token;
    public String offsetInMilliseconds;


    public String getPlayerActivity() {
        return playerActivity;
    }

    public void setPlayerActivity(String playerActivity) {
        this.playerActivity = playerActivity;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOffsetInMilliseconds() {
        return offsetInMilliseconds;
    }

    public void setOffsetInMilliseconds(String offsetInMilliseconds) {
        this.offsetInMilliseconds = offsetInMilliseconds;
    }
}
