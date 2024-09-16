package view;


import presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        System.out.println("Привет");
        while (work) {
            System.out.println(menu.menu());
            String choiceStr=scanner.nextLine();
            int choice = Integer.parseInt(choiceStr);
            menu.execute(choice);
        }
    }

    public void getInfo() {
        System.out.println("Введите имя интересующего человека");
        String personStr=scanner.nextLine();
        presenter.getInfo(personStr);
    }

    public void getHumansInfo() {
        presenter.getHumansInfo();
    }

    public void finish() {
        System.out.println("Работа завершилась");
        work=false;
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void sortByYear() {
        presenter.sortByYear();
    }

    public void childOf() {
        System.out.println("Укажите имя ребенка");
        String childString = scanner.nextLine();
        System.out.println("Укажите имя отца");
        String dadString = scanner.nextLine();
        System.out.println("Укажите имя матери");
        String momString = scanner.nextLine();
        presenter.childOf(childString, dadString, momString);

    }

    public void addPerson() {
        System.out.println("Укажите половую принадлежность человека");
        String gender = scanner.nextLine();
        System.out.println("Введите имя человека");
        String name =  scanner.nextLine();
        System.out.println("Укажите год рождения человека");
        String ageString = scanner.nextLine();
        int birthYear = Integer.parseInt(ageString);
        presenter.addPerson(gender, name, birthYear);
    }

    private void error(){
        System.out.println("Произошел сбой");

    }

}


