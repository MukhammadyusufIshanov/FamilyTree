package view.commands;

import view.ConsoleUI;

public class GetHumansInfo  extends Command {

    public GetHumansInfo(ConsoleUI consoleUI) {
        super("Вывести список людей", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().getHumansInfo();

    }
}
