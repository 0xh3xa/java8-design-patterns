/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.observer;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class WeatherStation implements Subject {

    private ConcurrentLinkedQueue<Observer> observers;
    private String state;

    public WeatherStation() {
        observers = new ConcurrentLinkedQueue<>();
    }

    @Override
    public void registerObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> {
            o.update(state);
        });
    }

    public void measureTemperature(String state) {
        this.state = state;
        notifyObservers();
    }

}
