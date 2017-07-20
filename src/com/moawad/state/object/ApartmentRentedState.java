/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.state.object;

import java.util.Random;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class ApartmentRentedState implements State {

    Automat automat;
   
    public ApartmentRentedState(Automat automat) {
        this.automat = automat;
    }

    @Override
    public String getApplication() {
        return "Hang on we're renting you an apartment";
    }

    @Override
    public String checkApplication() {
        return "Hang on we're renting you an apartment";
    }

    @Override
    public String rentApartment() {
        automat.setCount(automat.getCount() - 1);
        return "renting you an appartment";
    }

    @Override
    public String dispenseKeys() {
        if (automat.getCount() <= 0) {
            automat.setState(automat.getFullyRentedState());
        } else {
            automat.setState(automat.getWaitingState());
        }
        return "Here your keys";
    }
}
