package com.solvd.laba.jjaccomando.myinterfaces;

import com.solvd.laba.jjaccomando.Passenger;
import com.solvd.laba.jjaccomando.customexceptions.EmptyPassengerException;

public interface SeatInterface {

    Passenger getPassenger() throws EmptyPassengerException;
    boolean addPassenger(Passenger person);
    boolean isAvailable();
    int getSeatNum();
    char getSeatLetter();

}
