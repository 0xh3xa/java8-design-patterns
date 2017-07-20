/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.composite;

import java.util.Iterator;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class Division extends Corporate {

    private Corporate[] corporates = new Corporate[100];
    private int number = 0;
    private String name;

    public Division(String name) {
        this.name = name;
    }

    @Override
    public void add(Corporate c) {
        corporates[number++] = c;
    }

    @Override
    public Iterator iterator() {
        return new DivisonIterator(corporates);
    }

    @Override
    public void print() {
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            Corporate c = (Corporate) iterator.next();
            c.print();
        }
    }

}
