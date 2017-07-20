/*
GPL * Copyright (C) 2017 mr_stack <ahmadmoawad3@gmail.com>
GPL *
GPL * This program is free software; you can redistribute it and/or
GPL * modify it under the terms of the GNU General Public License
GPL * as published by the Free Software Foundation; either version 2
GPL * of the License, or (at your option) any later version.
 */
package com.moawad.facade;

/**
 * @author mr_stack <ahmadmoawad3@gmail.com>
 */
public class CharacterName {

    private char[] name;

    public CharacterName() {
        name = new char[7];
    }

    public void setFirstChar(char c) {
        name[0] = c;
    }

    public void setSecondChar(char c) {
        name[1] = c;
    }

    public void setThirdChar(char c) {
        name[2] = c;
    }

    public void setForthChar(char c) {
        name[3] = c;
    }

    public void setFifthChar(char c) {
        name[4] = c;
    }

    public void setSixthChar(char c) {
        name[5] = c;
    }

    public void setSeventhChar(char c) {
        name[6] = c;
    }

    public String getName() {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : name) {
            if (c != '\0') {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}
