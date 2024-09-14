package com.solvd.laba.jjaccomando.customexceptions;

public class EmptySeatException extends Exception {
    
    public EmptySeatException() {}

    public EmptySeatException(String message) {
        super(message);
    }
    
}
