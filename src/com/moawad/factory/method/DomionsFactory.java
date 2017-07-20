/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.factory.method;

import com.moawad.factory.Pizza;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class DomionsFactory extends PizzaFactory {

    protected String type;

    public DomionsFactory(String type) {
        this.type = type;
    }

    public Pizza createPizza() {
        if (type.toLowerCase().equals("chicken")) {
            return new ChickenDominosPizza();
        } else if (type.toLowerCase().equals("meat")) {
            return new MeatDomionsPizza();
        }
        return new Pizza();
    }

}
