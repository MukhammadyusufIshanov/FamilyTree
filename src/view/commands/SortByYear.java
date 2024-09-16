package view.commands;

import view.ConsoleUI;

public class SortByYear  extends Command {

    public SortByYear(ConsoleUI consoleUI) {
        super("Отсортировать по годам рождения", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().sortByYear();

    }
}
