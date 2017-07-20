/*
 * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 */
package com.moawad.state.object;

/**
 *
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public interface AutomatInterface {

    public void getApplication();

    public void checkApplication();

    public void rentAppartment();

    public void setState(State state);

    public State getWaitingState();

    public State getGotApplicationState();

    public State getApartmentState();

    public State getFullyRentedState();

    public int getCount();

    public void setCount(int count);

}
