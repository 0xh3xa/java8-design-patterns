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
public abstract class PizzaFactory {

    public PizzaFactory() {
    }

    protected abstract Pizza createPizza();
}
