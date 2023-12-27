package org.example.Presenter;

import org.example.Model.ToyShop;
import org.example.Model.ToyType;
import org.example.Model.Tuner;
import org.example.View.ConsoleUI;
import java.util.ArrayList;

public class LotteryProcessor {
    Tuner tuner;
    ToyShop toyShop;
    ConsoleUI ui;

    public LotteryProcessor(ConsoleUI ui){
        this.ui = ui;
        tuner =new Tuner();
    }

    public void play(){
        toyShop = new ToyShop(tuner);
    }

    public void getSettings() {
        printSettings();
    }

    public void tune() {
        tuner.tune();
        printSettings();
        System.out.println();
    }

    private void printSettings(){
        ArrayList<Integer> tmp = tuner.getProbabilityList();
        System.out.println("\n" + ToyType.getToys());
        for (Integer i: tmp) {
            System.out.print("   " + i + "  ");
        }
        System.out.println("\n");
    }
}
