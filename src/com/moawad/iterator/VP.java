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
public class VP {

    private String name;
    private String division;

    public VP(String name, String division) {
        this.name = name;
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void print() {
        System.out.println("Name: " + this.name + ", Division: " + division);
    }

}
