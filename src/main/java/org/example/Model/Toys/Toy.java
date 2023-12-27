package org.example.Model.Toys;

import org.example.Model.ToyType;

import java.util.ArrayList;

public abstract class Toy implements IToy {

    private static int idCounter = 100;
    private int id;
    private String name;
    private ToyType toyType;

    {

    }

    public Toy(String name, ToyType toyType){
        idStamp();
        this.name = name;
        this.toyType = toyType;

    }
    private void idStamp(){
        id = ++ idCounter;
    }

    @Override
    public abstract void put();

    @Override
    public abstract Toy get();
    public ToyType getType(){return toyType;}

    @Override
    public String toString() {
        return ("Id: " + id + ", наименование: " + name +", тип: " + toyType);
    }
}
