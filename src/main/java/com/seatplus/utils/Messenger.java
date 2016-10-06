package com.seatplus.utils;

/**
 * Created by anushka.ekanayake on 10/6/2016.
 * uses to pass some message
 */
public class Messenger {
    private String message = null;

    public Messenger(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
