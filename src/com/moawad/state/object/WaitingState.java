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
public class WaitingState implements State {

    Automat automat;

    public WaitingState(Automat automat) {
        this.automat = automat;
    }

    @Override
    public String getApplication() {
        automat.setState(automat.getGotApplicationState());
        return "Thanks for the application";
    }

    @Override
    public String checkApplication() {
        return "You have to get an application";
    }

    @Override
    public String rentApartment() {
        return "You have to get an application";
    }

    @Override
    public String dispenseKeys() {
        return "You have to get an application";
    }

}
