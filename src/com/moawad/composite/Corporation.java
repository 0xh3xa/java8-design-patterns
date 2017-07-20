/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class Corporation extends Corporate {

    private List<Corporate> copList = new ArrayList<>();

    @Override
    public void add(Corporate c) {
        this.copList.add(c);
    }

    @Override
    public void print() {
        Iterator iterator = copList.iterator();
        while (iterator.hasNext()) {
            Corporate c = (Corporate) iterator.next();
            c.print();
        }
    }

}
