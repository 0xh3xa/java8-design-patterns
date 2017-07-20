/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.iterator;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class Division {

    private VP[] vps = new VP[100];
    private int number = 0;
    private String n;

    public Division(String name) {
        this.n = name;
    }

    public void add(String name) {
        VP vp = new VP(this.n, name);
        vps[number++] = vp;
    }

    public DivisionIterator iterator(){
        return new DivisionIterator(vps);
    }
}
