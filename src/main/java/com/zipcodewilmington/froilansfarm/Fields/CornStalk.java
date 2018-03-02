package com.zipcodewilmington.froilansfarm.Fields;

public class CornStalk extends Crop {

    protected EarCorn earCorn = new EarCorn();


    public Object yields() {
        return earCorn;
    }

    public boolean hasBeenFertilized() {

        return false;
    }

    public boolean hasBeenHarvested() {

        return false;
    }
}