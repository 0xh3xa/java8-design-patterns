/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.chainingobjects;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class Intermediate implements HelpInterface {

    private final int INTERMEDIATE = 2;
    private HelpInterface helpInterface;

    public Intermediate(HelpInterface helpInterface) {
        this.helpInterface = helpInterface;
    }

    @Override
    public void getHelp(int helpContant) {
        if (helpContant != INTERMEDIATE) {
            helpInterface.getHelp(helpContant);
        } else {
            System.out.println("Intermediate, What do you want!");
        }
    }
}
