package com.solvd.laba.jjaccomando.myinterfaces;

import com.solvd.laba.jjaccomando.Passenger;
import com.solvd.laba.jjaccomando.customexceptions.DuplicateBookingException;
import com.solvd.laba.jjaccomando.customexceptions.EmptyPassengerException;
import com.solvd.laba.jjaccomando.myenums.SeatType;

public interface FlightInterface {

    boolean getSeatsAvailable();
    boolean getSeatsAvailable(SeatType seatType);
    boolean bookSeat(Passenger person, SeatType seatType) throws DuplicateBookingException;
    int getNumPassengers();
    Passenger[] getPassengers() throws EmptyPassengerException;
    String flightInfo();

}
