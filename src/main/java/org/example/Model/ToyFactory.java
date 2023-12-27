package org.example.Model;

import org.example.Model.Toys.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ToyFactory{
    ArrayList<Integer> list;
    ArrayList<Toy> toyList;

    private HashMap<ToyType, Integer> raffleMap;

    public ToyFactory(ArrayList<Integer> list) {
        this.list = list;
        toyList = new ArrayList<>();
        raffleMap = new HashMap<>();
    }

    public void makeANOrder(){
        for (int i = 0; i < list.size(); i++) {
            raffleMap.put( ToyType.getToys().get(i), list.get(i));
        }
        produce();
    }
    private void produce(){
        for (Map.Entry<ToyType, Integer> pair : raffleMap.entrySet()) {
            for (int i = 0; i < pair.getValue(); i++) {
                if(pair.getKey().toString().equals( "DOLL" )) toyList.add(new Doll("barbie", pair.getKey()) ) ;
                if(pair.getKey().toString().equals( "LEGOKIT" )) toyList.add( new LegoKit("lego", pair.getKey()) ) ;
                if(pair.getKey().toString().equals( "ROBOT" )) toyList.add( new Robot("wall-e", pair.getKey()) ) ;
            }
        }
    }
    public ArrayList<Toy> getOrder(){return toyList;}

}
