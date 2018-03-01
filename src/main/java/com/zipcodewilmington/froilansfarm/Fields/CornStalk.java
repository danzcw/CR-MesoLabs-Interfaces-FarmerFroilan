package com.zipcodewilmington.froilansfarm.Fields;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;

public class CornStalk extends Crop {

   protected EarCorn earCorn = new EarCorn();



    public Object yields() {
        return earCorn;
    }
}
