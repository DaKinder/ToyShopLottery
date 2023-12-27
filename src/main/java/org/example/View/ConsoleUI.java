package org.example.View;

import org.example.Presenter.LotteryProcessor;
import java.util.Scanner;

public class ConsoleUI {
    Scanner scanner;
    LotteryMenu menu;
    LotteryProcessor lp;
    boolean process = true;

    public ConsoleUI(){
        menu = new LotteryMenu(this);
        scanner = new Scanner( System.in );
        lp = new LotteryProcessor(this);
    }
    public void start(){

        System.out.println("Welcome to lottery!");

        while (process){
            System.out.println(menu.showMenu());
            System.out.print("Make a choice: ");
            String userChoice = scanner.nextLine();
            try{
            menu.execute(Integer.parseInt(userChoice));
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Wrong choice!");
            }
        }
    }

    public void play(){
        lp.play();
    }

    public void tune(){
        lp.tune();
    }

    public void close() {
        process = false;
    }

    public void show() {
        lp.getSettings();
    }
}
