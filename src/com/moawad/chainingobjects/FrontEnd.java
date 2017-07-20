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
public class FrontEnd implements HelpInterface {

    private final int FRONT_END_HELP = 1;
    private HelpInterface helpInterface;

    public FrontEnd(HelpInterface helpInterface) {
        this.helpInterface = helpInterface;
    }

    @Override
    public void getHelp(int helpContant) {
        if (helpContant != FRONT_END_HELP) {
            helpInterface.getHelp(helpContant);
        } else {
            System.out.println("Front-End, What do you want!");
        }
    }

}
