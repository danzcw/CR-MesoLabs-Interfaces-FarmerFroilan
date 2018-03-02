package com.zipcodewilmington.froilansfarm.Farms;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable{

    Horse horse = new Horse();
    protected ArrayList<Horse> horses;

    public Stable() {
        horses = new ArrayList<Horse>();
    }
}
