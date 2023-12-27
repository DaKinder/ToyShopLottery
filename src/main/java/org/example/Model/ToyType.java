package org.example.Model;

import java.util.ArrayList;

public enum ToyType {
    DOLL,
    LEGOKIT,
    ROBOT,
    CAR;


    public static ArrayList<ToyType> getToys(){
        ArrayList<ToyType> toys = new ArrayList<>();
        toys.add(DOLL);
        toys.add(LEGOKIT);
        toys.add(ROBOT);
//        toys.add(CAR);
        return toys;
    }

}
