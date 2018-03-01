package com.zipcodewilmington.froilansfarm.Vehicles;

public abstract class Aircraft extends Vehicle {


    public Aircraft() {

    }

    public void fly() {

    }

    public String makeNoise() {
        return "I feel the need, the need for speed!";
    }

    public boolean rideable() {
        return false;
    }
}
