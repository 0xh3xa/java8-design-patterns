/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.singleton.threadsafe;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class SerializedLazyInnerDBConnection implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private static class Helper {

        private static final SerializedLazyInnerDBConnection INSTANCE = new SerializedLazyInnerDBConnection();
    }

    public static SerializedLazyInnerDBConnection getInstance() {
        return Helper.INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException {
        return Helper.INSTANCE;
    }
}
