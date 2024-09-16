package view.commands;

import view.ConsoleUI;

public class GetInfo  extends Command {

    public GetInfo(ConsoleUI consoleUI) {
        super("Получить информацию о человеке", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().getInfo();

    }
}
