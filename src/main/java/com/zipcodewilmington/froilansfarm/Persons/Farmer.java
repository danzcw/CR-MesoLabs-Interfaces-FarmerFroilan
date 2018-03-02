package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Fields.Crop;
import com.zipcodewilmington.froilansfarm.Persons.Rider;

public class Farmer extends Person implements Botanist, Rider {

    Farmer froilan;

    {
        froilan = new Farmer();
    }


    public void eat() {

    }

    public String makeNoise() {
        return null;
    }

    public void plant(Crop crop) {

    }

    public void mount() {

    }

    public void dismount() {

    }
}
