package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Fields.Produce;

public class FertilizedEgg extends EdibleEgg implements Produce{

    Chicken chick = new Chicken();

    public Object yields() {
        return chick;
    }

}
