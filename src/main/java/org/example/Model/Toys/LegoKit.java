package org.example.Model.Toys;

import org.example.Model.ToyType;

public class LegoKit extends Toy {
    public LegoKit(String name, ToyType toyType) {
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
