package view.commands;

import view.ConsoleUI;

public class ChildOf  extends Command {

    public ChildOf(ConsoleUI consoleUI) {
        super("Объявить о ребенке", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().childOf();

    }
}
