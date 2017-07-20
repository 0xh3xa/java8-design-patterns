/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.strategy.builder;

import com.moawad.template.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class BMW implements CarBuildable {

    private List<Integer> actions;

    public void loadActions(List<Integer> actions) {
        this.actions = actions;
    }

    @Override
    public final void go() {
        Iterator<Integer> iterator = actions.iterator();
        while (iterator.hasNext()) {
            switch (iterator.next()) {
                case 1:
                    start();
                    break;

                case 2:
                    accelerate();
                    break;

                case 3:
                    test();
                    break;

                case 4:
                    stop();
                    break;

            }

        }
    }

    private void start() {
        System.out.println("Starting BMW!");
    }

    private void accelerate() {
        System.out.println("Accelerating BMW!");
    }

    private void test() {
        System.out.println("Testing BMW!");
    }

    private void stop() {
        System.out.println("Stop BMW!");
    }

}
