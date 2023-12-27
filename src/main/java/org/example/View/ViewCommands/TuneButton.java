package org.example.View.ViewCommands;

import org.example.View.ConsoleUI;

public class TuneButton extends Command{
    private String menuItem;
    private ConsoleUI ui;

    public TuneButton(ConsoleUI ui) {
        this.ui = ui;
        menuItem = "Сhange lottery settings";
    }

    public String getMenuItem(){
        return menuItem;
    }
    public void execute(){
        ui.tune();
    }

    @Override
    public String getDescription() {
        return menuItem;
    }
}
