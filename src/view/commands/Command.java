package view.commands;

import view.ConsoleUI;

public abstract class Command {
    String description;
    ConsoleUI consoleUI;

    public Command(String description, ConsoleUI consoleUI) {
        this.description = description;
        this.consoleUI = consoleUI;
    }

    public String getDescription() {
        return description;
    }

    ConsoleUI getConsoleUI() {
        return consoleUI;
    }

    public abstract void execute();

}
