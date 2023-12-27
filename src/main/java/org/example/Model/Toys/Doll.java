package org.example.Model.Toys;

import org.example.Model.ToyType;

public class Doll extends Toy {
    public Doll( String name, ToyType toyType) {
        super(name, toyType );
    }

    @Override
    public void put() {
    }

    @Override
    public Toy get() {
        return null;
    }
}
