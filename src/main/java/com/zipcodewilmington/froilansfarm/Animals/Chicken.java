package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Fields.Produce;

public class Chicken extends Animal implements Produce {

    protected Egg egg = new Egg();
    protected FertilizedEgg fertilizedEgg = new FertilizedEgg();
    Chicken chicken;

    public boolean hasBeenFertilized;

    {
        hasBeenFertilized = false;
    }


    public Chicken() {
        chicken = new Chicken();
    }

    public Object yields() {
        if (chicken.hasBeenFertilized) {
            return fertilizedEgg; }
        { return egg;
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public String makeNoise() {
        return "Why the hell did I cross the road?";
    }
}
