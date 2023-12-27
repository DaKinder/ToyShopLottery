package org.example.Model;

import org.example.Model.Toys.RaffleWriter;
import org.example.Model.Toys.Toy;
import java.util.ArrayList;
import java.util.Collections;

public class ToyShop {

    ArrayList<Integer> list;
    ToyFactory toyFactory;
    ArrayList<Toy> toys;
    RaffleWriter rw;

    public ToyShop(Tuner tuner){
        list = tuner.getProbabilityList();
        toyFactory = new ToyFactory(list);
        toyFactory.makeANOrder();
        toys = toyFactory.getOrder();
        startLottery();
    }
    private void startLottery(){
        rw = new RaffleWriter();
        for (int i = 0; i < toys.size();) {
            Collections.shuffle(toys);
            String tmp = toys.get(i).toString();
            rw.writeToFile(tmp);
            toys.remove(i);
        }

        System.out.println();
    }
}
