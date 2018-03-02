package com.zipcodewilmington.froilansfarm.Farms;

import com.zipcodewilmington.froilansfarm.Fields.Field;

import java.util.ArrayList;

public abstract class Farm {
   protected ArrayList<Stable> stables = new ArrayList<Stable>();
   protected ArrayList<ChickeCoop> chickeCoops = new ArrayList<ChickeCoop>();
   protected ArrayList<Field> fields = new ArrayList<Field>();

}
