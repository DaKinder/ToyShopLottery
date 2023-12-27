package org.example.View;

import org.example.View.ViewCommands.*;

import java.util.ArrayList;

public class LotteryMenu {

    ArrayList<Command> menuList;

    public LotteryMenu(ConsoleUI ui) {
        menuList = new ArrayList<>();
        menuList.add( new StartButton( ui ) );
        menuList.add( new ShowButton( ui ) );
        menuList.add( new TuneButton( ui ) );
        menuList.add( new FinishButton( ui ) );

    }

    public String showMenu() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < menuList.size(); i++) {
            sb.append(i + 1);
            sb.append( ". " );
            sb.append( menuList.get(i).getDescription() );
            sb.append( "\n" );
        }
        return sb.toString();
    }

    public void execute(int choice) {
        Command cmd = menuList.get(choice-1);
        cmd.execute();
    }
}
