package com.alexa.challenge.alexademo.model;

public class Slots {
    private Time time;
    private FromTime fromTime;
    private ToTime toTime;
    private Period period;
    private Amount amount;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public FromTime getFromTime() {
        return fromTime;
    }

    public void setFromTime(FromTime fromTime) {
        this.fromTime = fromTime;
    }

    public ToTime getToTime() {
        return toTime;
    }

    public void setToTime(ToTime toTime) {
        this.toTime = toTime;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
