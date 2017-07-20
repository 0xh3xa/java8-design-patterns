/*
 * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 */
package com.moawad.observer;

/**
 *
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public interface Subject {

    public void registerObservers(Observer observer);

    public void removeObservers(Observer observer);

    public void notifyObservers();

}
