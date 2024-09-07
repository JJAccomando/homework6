package com.solvd.laba.jjaccomando.myinterfaces;

import com.solvd.laba.jjaccomando.Passenger;
import com.solvd.laba.jjaccomando.customexceptions.NullPassengerException;

public interface SeatInterface {

    Passenger getPassenger() throws NullPassengerException;
    boolean addPassenger(Passenger person);
    boolean isAvailable();
    int getSeatNum();
    char getSeatLetter();

}
