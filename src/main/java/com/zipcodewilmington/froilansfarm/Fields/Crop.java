package com.zipcodewilmington.froilansfarm.Fields;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;

public abstract class Crop implements Produce{
    protected CornStalk cornStalk = new CornStalk();
    protected TomatoPlant tomatoPlant = new TomatoPlant();

    public Crop(){

    }

    public boolean hasBeenFertilized () {
        return false;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public Object yields() {
        return null;
    }
}
