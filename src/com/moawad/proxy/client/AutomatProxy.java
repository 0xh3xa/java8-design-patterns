/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.proxy.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class AutomatProxy implements Runnable {

    private Thread thread;
    private Socket socket;
    private InputStream in;
    private PrintWriter out;
    private int character;

    public AutomatProxy() {
        try {
            socket = new Socket("127.0.0.1", 3029);
            System.out.println("Connecting...");
            in = socket.getInputStream();
            out = new PrintWriter(socket.getOutputStream(), true);
            thread = new Thread(this);
            thread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (socket != null && socket.isConnected()) {
            System.out.println("Connected");
        }
    }

    @Override
    public void run() {
        try {
            while ((character = in.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getApplication() {
        out.println("gotApplication");
    }

    public void checkApplication() {
        out.println("checkApplication");
    }

    public void rentApartment() {
        out.println("rentApartment");
    }
}
