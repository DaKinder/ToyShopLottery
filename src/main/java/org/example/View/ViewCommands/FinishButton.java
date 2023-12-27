package org.example.View.ViewCommands;

import org.example.View.ConsoleUI;
import org.example.View.ViewCommands.Command;

public class FinishButton extends Command {
    private String menuItem;
    private ConsoleUI ui;

    public FinishButton(ConsoleUI ui) {
        this.ui = ui;
        menuItem = "Finish the toy lottery";
    }

    public String getMenuItem(){
        return menuItem;
    }
    public void execute(){
        ui.close();
    }

    @Override
    public String getDescription() {
        return menuItem;
    }
}

