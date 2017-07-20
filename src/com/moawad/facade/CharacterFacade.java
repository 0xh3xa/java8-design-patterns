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
public class CharacterFacade {

    private CharacterName characterName;

    public CharacterFacade() {
        characterName = new CharacterName();
    }

    public void setName(String name) {
        if (name.length() > 0) {
            characterName.setFirstChar(name.charAt(0));
        }
        if (name.length() > 1) {
            characterName.setSecondChar(name.charAt(1));
        }
        if (name.length() > 2) {
            characterName.setThirdChar(name.charAt(2));
        }
        if (name.length() > 3) {
            characterName.setForthChar(name.charAt(3));
        }
        if (name.length() > 4) {
            characterName.setFifthChar(name.charAt(4));
        }
        if (name.length() > 5) {
            characterName.setSixthChar(name.charAt(5));
        }
        if (name.length() > 6) {
            characterName.setSeventhChar(name.charAt(6));
        }

    }

    public String getName() {
        return characterName.getName();
    }
}
