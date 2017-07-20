/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.iterator;

import java.util.Iterator;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class DivisionIterator implements Iterator<VP> {

    private VP[] vps;
    private int pos = 0;

    DivisionIterator(VP[] vps) {
        this.vps = vps;
    }

    @Override
    public boolean hasNext() {
        if (pos < vps.length && vps[pos] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public VP next() {
        return vps[pos++];
    }

}
