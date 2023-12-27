package org.example.Model.Toys;

import org.example.Model.ToyType;
import org.example.Model.Toys.Toy;

public class Robot extends Toy {
    public Robot(String name, ToyType toyType) {
        super(name, toyType );
    }

    @Override
    public void put() {
    }

    @Override
    public Toy get() {
        return this;
    }
}
