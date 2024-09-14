package com.solvd.laba.jjaccomando.interfaces;

import com.solvd.laba.jjaccomando.CustomLinkedList;
import com.solvd.laba.jjaccomando.Luggage;
import com.solvd.laba.jjaccomando.Seat;
import com.solvd.laba.jjaccomando.exceptions.*;

public interface PassengerInterface {

    int MAX_LUGGAGE = 10;

    String getFirstName();
    String getLastName();
    boolean addBags(Luggage bag) throws OversizeBagException, OverLimitException;
    int getNumBags();
    void setSeatNum(Seat seat) throws DuplicateBookingException;
    Seat getSeat() throws EmptySeatException;
    CustomLinkedList<Luggage> getLuggage() throws EmptyBagException;
    
}
