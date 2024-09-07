package com.solvd.laba.jjaccomando.myinterfaces;

import com.solvd.laba.jjaccomando.CustomLinkedList;
import com.solvd.laba.jjaccomando.Luggage;
import com.solvd.laba.jjaccomando.Seat;
import com.solvd.laba.jjaccomando.customexceptions.*;

public interface PassengerInterface {

    int MAX_LUGGAGE = 10;

    String getFirstName();
    String getLastName();
    boolean addBags(Luggage bag) throws OversizeBagException, OverLimitException;
    int getNumBags();
    void setSeatNum(Seat seat) throws DoubleBookException;
    Seat getSeat() throws NullSeatException;
    CustomLinkedList<Luggage> getLuggage() throws NullBagException;
    
}
