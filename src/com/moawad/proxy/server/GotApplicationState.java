/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.proxy.server;

import java.util.Random;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class GotApplicationState implements State {

    AutomatServer automat;
    Random random;

    public GotApplicationState(AutomatServer automat) {
        this.automat = automat;
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public String getApplication() {
        return "You have an application already";
    }

    @Override
    public String checkApplication() {
//        int yesno = random.nextInt() % 10;
//        if (yesno > 4 && automat.getCount() > 0) {
        automat.setState(automat.getApartmentState());
        return "Congratulations, you were approved";
//        } else {
//            automat.setState(automat.getWaitingState());
//            return "Sorry you ware not approved";
//        }
    }

    @Override
    public String rentApartment() {
        return "You must hvae your application approved";
    }

    @Override
    public String dispenseKeys() {
        return "You must hvae your application approved";
    }

}
