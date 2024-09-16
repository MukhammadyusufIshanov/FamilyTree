import model.Person;
import view.ConsoleUI;
import view.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        View view = new ConsoleUI();
        view.start();
    }
}
