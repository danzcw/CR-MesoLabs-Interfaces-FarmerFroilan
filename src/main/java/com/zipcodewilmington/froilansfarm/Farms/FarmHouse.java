package com.zipcodewilmington.froilansfarm.Farms;

public class FarmHouse extends Farm {
    private static FarmHouse ourInstance = new FarmHouse();

    public static FarmHouse getInstance() {
        return ourInstance;
    }

    private FarmHouse() {
    }
}
