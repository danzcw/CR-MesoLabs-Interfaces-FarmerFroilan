package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Fields.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor() {

    }

    public void harvest(Crop crop) {

    }


    public void operate() {

    }

    public String makeNoise() {
        return null;
    }

    public boolean rideable() {
        return false;
    }
}
