/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.strategy.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class BMWBuilderImpl implements CarBuilder {

    private BMW bmw;
    private List<Integer> actions;

    public BMWBuilderImpl() {
        this.bmw = new BMW();
        actions = new ArrayList<>();
    }

    @Override
    public void addStart() {
        actions.add(1);
    }

    @Override
    public void addAccelerate() {
        actions.add(2);
    }

    @Override
    public void addTest() {
        actions.add(3);
    }

    @Override
    public void addStop() {
        actions.add(4);
    }

    @Override
    public CarBuildable getCar() {
        bmw.loadActions(actions);
        return bmw;
    }

}
