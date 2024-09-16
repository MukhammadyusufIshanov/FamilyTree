package view.commands;

import view.ConsoleUI;

public class Finish  extends Command {

    public Finish(ConsoleUI consoleUI) {
        super("Работа завершена", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().finish();

    }
}
