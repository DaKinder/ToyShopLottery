package org.example.Model;

import java.util.*;
public class Tuner {

    private ArrayList<Integer> probabilityList;
    final int MAXVALUE = 100;
    ArrayList<ToyType> toys;

    public Tuner(){
        probabilityList = new ArrayList<>();
        probabilityList.add(20);
        probabilityList.add(20);
        probabilityList.add(60);
        toys = ToyType.getToys();
    }

    public Tuner( ArrayList<Integer> list) {
        probabilityList = new ArrayList<>();
    }

    public void tune(){

        boolean isTuned = false;
        Scanner sc = new Scanner(System.in);

        while (!isTuned){

            for (int i = 1; i <= toys.size(); i++) {
                System.out.print("SET toy for - " + toys.get(i - 1) + ": ");

                try{
                    if(probabilityList.size() == i - 1) probabilityList.add(sc.nextInt());
                    else probabilityList.set(i - 1, sc.nextInt());
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input");
                }
            }
            probabilityList = check();
            if(probabilityList.size() != 0) isTuned = true;
        }
    }

    public ArrayList<Integer> check(){

        int value = 0;

        for (Integer i : probabilityList) value += i;

        if (MAXVALUE != value) {

            for (int i = 0; i < probabilityList.size(); i++) {
                int fixed = probabilityList.get(i) - (value - MAXVALUE) / probabilityList.size();
                if (fixed < 0) {
                    System.out.println( "\nWrong parameters, try set again\n" );
                    probabilityList.clear();
                    break;
                }
                probabilityList.set(i, fixed);
            }
        }
        System.out.println("\nSettings were adjusted due to incorrect input\n");
        return probabilityList;
    }

    public ArrayList<Integer> getProbabilityList(){return probabilityList;}

}
