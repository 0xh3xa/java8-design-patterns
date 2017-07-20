/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.observer.duke;

import java.util.Observable;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class WeatherStation extends Observable {

    private String state;

    public void measureTemperature(String state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }

    public String getState() {
        return state;
    }
}
