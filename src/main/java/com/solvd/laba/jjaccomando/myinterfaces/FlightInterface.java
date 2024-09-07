package com.solvd.laba.jjaccomando.myinterfaces;

import com.solvd.laba.jjaccomando.Passenger;
import com.solvd.laba.jjaccomando.customexceptions.DoubleBookException;
import com.solvd.laba.jjaccomando.customexceptions.NullPassengerException;
import com.solvd.laba.jjaccomando.myenums.SeatType;

public interface FlightInterface {

    boolean getSeatsAvailable();
    boolean getSeatsAvailable(SeatType seatType);
    boolean bookSeat(Passenger person, SeatType seatType) throws DoubleBookException;
    int getNumPassengers();
    Passenger[] getPassengers() throws NullPassengerException;
    String flightInfo();

}
