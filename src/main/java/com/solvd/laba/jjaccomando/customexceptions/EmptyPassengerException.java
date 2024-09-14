package com.solvd.laba.jjaccomando.customexceptions;

public class EmptyPassengerException extends Exception {

    public EmptyPassengerException() {}

    public EmptyPassengerException(String message) {
        super(message);
    }

}
