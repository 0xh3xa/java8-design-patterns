/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.state;

import java.util.Random;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class RentalMethods {

    final static int FULLY_RENTED = 0;
    final static int WAITING = 1;
    final static int GOT_APPLICATION = 2;
    final static int APARTMENT_RENTED = 3;
    Random random;
    int numberAppartments;
    int state = WAITING;

    public RentalMethods(int n) {
        this.numberAppartments = n;
        random = new Random();
    }

    public void getApplication() {
        switch (state) {
            case FULLY_RENTED:
                System.out.println("Sorry! we're fully rented");
                break;
            case WAITING:
                System.out.println("Thanks for the application");
                state = GOT_APPLICATION;
                break;
            case GOT_APPLICATION:
                System.out.println("You have an application already");
                break;
            case APARTMENT_RENTED:
                System.out.println("Hang on, we're renting you an apartment");
                break;
        }
    }

    public void checkApplication() {
        int yesno = random.nextInt() % 10;

        switch (state) {
            case FULLY_RENTED:
                System.out.println("Sorry! we're fully rented");
                break;
            case WAITING:
                System.out.println("You have to get an application");
                break;
            case GOT_APPLICATION:
                if (yesno > 4 && numberAppartments > 0) {
                    System.out.println("Congratulations, you were approved");
                    state = APARTMENT_RENTED;
                    rentApartment();
                } else {
                    System.out.println("Sorry, you were not approved");
                    state = WAITING;
                }
                break;
            case APARTMENT_RENTED:
                System.out.println("Hang on, we're renting you an apartment");
                break;
        }
    }

    private void rentApartment() {
        switch (state) {
            case FULLY_RENTED:
                System.out.println("Sorry! we're fully rented");
                break;
            case WAITING:
                System.out.println("You have to get an application");
                break;
            case GOT_APPLICATION:
                System.out.println("You must have your application checked");
                break;
            case APARTMENT_RENTED:
                System.out.println("Renting you an apartment");
                numberAppartments--;
                dispenseKeys();
                break;
        }

    }

    private void dispenseKeys() {

        switch (state) {
            case FULLY_RENTED:
                System.out.println("Sorry! we're fully rented");
                break;
            case WAITING:
                System.out.println("You have to get an application");
                break;
            case GOT_APPLICATION:
                System.out.println("You must have your application checked");
                break;
            case APARTMENT_RENTED:
                System.out.println("Here are you keys");
                state = WAITING;
                break;
        }
    }

}
