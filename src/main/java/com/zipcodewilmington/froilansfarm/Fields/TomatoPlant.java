package com.zipcodewilmington.froilansfarm.Fields;

import java.util.ArrayList;

public class TomatoPlant extends Crop{
    protected Tomato tomato = new Tomato();


    public Object yields() {
        return tomato;
    }
}
