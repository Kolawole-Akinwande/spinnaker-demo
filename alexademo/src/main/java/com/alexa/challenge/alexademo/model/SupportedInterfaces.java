package com.alexa.challenge.alexademo.model;

public class SupportedInterfaces {
    public Display Display;

    public Display getDisplay() {
        return Display;
    }

    public void setDisplay(Display display) {
        this.Display = display;
    }

    public AudioPlayer audioPlayer;

    public AudioPlayer getAudioPlayer() {
        return audioPlayer;
    }

    public void setAudioPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }
}
