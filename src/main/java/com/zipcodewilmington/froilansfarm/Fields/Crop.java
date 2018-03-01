package com.zipcodewilmington.froilansfarm.Fields;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;

public class Crop implements Produce{
    ArrayList<CornStalk> earCorns = new ArrayList<CornStalk>();
    ArrayList<TomatoPlant> tomatoPlants = new ArrayList<TomatoPlant>();

    public Crop(){

    }

    public boolean hasBeenFertilized (Crop crop) {
        return false;
    }

    public boolean hasBeenHarvested(Crop crop) {
        return false;
    }

    public Object yields() {
        return null;
    }
}
