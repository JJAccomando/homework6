package com.solvd.laba.jjaccomando.customexceptions;

public class DuplicateBookingException extends Exception {

    public DuplicateBookingException() {}
    
    public DuplicateBookingException(String message) {
        super(message);
    }

}
