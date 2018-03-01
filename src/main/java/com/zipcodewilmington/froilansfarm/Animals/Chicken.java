package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {

    protected Egg egg = new Egg();



    public Chicken() {

    }


    public boolean hasBeenFertilized() {
        return false;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public Object yields() {
        return egg;
    }

    public void eat() {

    }

    public String makeNoise() {
        return "Why the hell did I cross the road?";
    }
}
