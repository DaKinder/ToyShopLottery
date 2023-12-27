package org.example.Model.Toys;

import org.example.Model.ToyType;

public class Car extends Toy {
    public Car(String name, ToyType toyType) {
        super( name, toyType );
    }

    @Override
    public void put() {
    }

    @Override
    public Toy get() {
        return null;
    }
}
