/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.template;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public abstract class Car {

    public final void go() {
        start();
        accelerate();
        if(TestOK())
            test();
        stop();
    }

    public void start() {
        System.out.println("Car is starting!");
    }

    public void accelerate() {
        System.out.println("Car is moving!");
    }

    public void stop() {
        System.out.println("Car is stopping!");
    }

    public boolean TestOK() {
        return true;
    }

    public void test() {
        System.out.println("Car testing!");
    }
}
