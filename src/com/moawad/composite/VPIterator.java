/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.composite;

import java.util.Iterator;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class VPIterator implements Iterator {

    private VP vp;

    public VPIterator(VP vp) {
        this.vp = vp;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return this.vp;
    }

}
