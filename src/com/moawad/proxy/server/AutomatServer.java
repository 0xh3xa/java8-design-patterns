/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.proxy.server;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class AutomatServer implements AutomatInterface, Runnable {

    State waitingState;
    State gotApplicationState;
    State apartmentRentedState;
    State fullyRentedState;
    State state;
    int count;
    ServerSocket serverSocket;
    Socket socket;
    PrintWriter out;
    Thread thread;

    public static void main(String[] args) {
        new AutomatServer(9);
    }

    public AutomatServer(int n) {
        this.count = n;
        this.waitingState = new WaitingState(this);
        this.gotApplicationState = new GotApplicationState(this);
        this.apartmentRentedState = new ApartmentRentedState(this);
        this.fullyRentedState = new FullyRentedState(this);
        this.state = waitingState;
        init();
    }

    private void init() {
        try {
            serverSocket = new ServerSocket(3029);
            socket = serverSocket.accept();
            out = new PrintWriter(socket.getOutputStream(), true);

            thread = new Thread(this);
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getApplication() {
        out.println(state.getApplication());
    }

    @Override
    public void checkApplication() {
        out.println(state.checkApplication());
    }

    @Override
    public void rentAppartment() {
        out.println(state.rentApartment());
        out.println(state.dispenseKeys());
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public State getWaitingState() {
        return this.waitingState;
    }

    @Override
    public State getGotApplicationState() {
        return this.gotApplicationState;
    }

    @Override
    public State getApartmentState() {
        return this.apartmentRentedState;
    }

    @Override
    public State getFullyRentedState() {
        return this.fullyRentedState;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        String incomingString;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while ((incomingString = in.readLine()) != null) {
                if (incomingString.equals("gotApplication")) {
                    getApplication();
                } else if (incomingString.equals("checkApplication")) {
                    checkApplication();
                } else if (incomingString.equals("rentApartment")) {
                    rentAppartment();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
