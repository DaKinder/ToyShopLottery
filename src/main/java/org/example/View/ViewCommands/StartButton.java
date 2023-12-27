package org.example.View.ViewCommands;

import org.example.View.ConsoleUI;
import org.example.View.ViewCommands.Command;

public class StartButton extends Command {
    private String menuItem;
    private ConsoleUI ui;

    public StartButton(ConsoleUI ui) {
        this.ui = ui;
        menuItem = "Start the toys lottery";
    }

    public String getMenuItem(){
        return menuItem;
    }
    public void execute(){
        ui.play();
    }

    @Override
    public String getDescription() {
        return menuItem;
    }
}
