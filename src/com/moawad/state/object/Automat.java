/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.state.object;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class Automat implements AutomatInterface {

    State waitingState;
    State gotApplicationState;
    State apartmentRentedState;
    State fullyRentedState;
    State state;
    int count;

    public Automat(int n) {
        this.count = n;
        this.waitingState = new WaitingState(this);
        this.gotApplicationState = new GotApplicationState(this);
        this.apartmentRentedState = new ApartmentRentedState(this);
        this.fullyRentedState = new FullyRentedState(this);
        this.state = waitingState;

    }

    @Override
    public void getApplication() {
        System.out.println(state.getApplication());
    }

    @Override
    public void checkApplication() {
        System.out.println(state.checkApplication());
    }

    @Override
    public void rentAppartment() {
        System.out.println(state.rentApartment());
        System.out.println(state.dispenseKeys());
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public State getWaitingState() {
        return this.waitingState;
    }

    @Override
    public State getGotApplicationState() {
        return this.gotApplicationState;
    }

    @Override
    public State getApartmentState() {
        return this.apartmentRentedState;
    }

    @Override
    public State getFullyRentedState() {
        return this.fullyRentedState;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

}
