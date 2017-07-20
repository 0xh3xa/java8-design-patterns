/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.singleton.threadsafe;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class LazyInnerDBConnection {

    private static class Helper {
        private static final LazyInnerDBConnection INSTANCE = new LazyInnerDBConnection();
    }

    public static LazyInnerDBConnection getInstance() {
        return Helper.INSTANCE;
    }
}
