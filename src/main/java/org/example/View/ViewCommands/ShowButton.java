package org.example.View.ViewCommands;

import org.example.View.ConsoleUI;

public class ShowButton extends Command{
    private String menuItem;
    private ConsoleUI ui;

    public ShowButton(ConsoleUI ui) {
        this.ui = ui;
        menuItem = "Show lottery settings";
    }

    public String getMenuItem(){
        return menuItem;
    }
    public void execute(){
        ui.show();
    }

    @Override
    public String getDescription() {
        return menuItem;
    }
}
