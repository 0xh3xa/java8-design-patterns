/*
 * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 */
package com.moawad.main;

import com.moawad.composite.Corporation;
import com.moawad.composite.Division;
import com.moawad.composite.VP;
import com.moawad.proxy.client.AutomatProxy;
import com.moawad.state.RentalMethods;
import com.moawad.state.object.Automat;


/*
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class MainCtl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutomatProxy proxy = new AutomatProxy();
        proxy.getApplication();
        proxy.checkApplication();
        proxy.rentApartment();
    }

}
