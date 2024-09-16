package presenter;

import model.Service;
import view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();


    }


    public void addPerson(String gender, String name, int birthYear) {
        service.addPerson(gender, name, birthYear);
        getHumansInfo();
    }

    public void getHumansInfo(){
        String info = service.getHumansInfo();
        view.printAnswer(info);
    }

    public void sortByYear() {
        service.sortByYear();
        getHumansInfo();
    }

    public void sortByName(){
        service.sortByName();
        getHumansInfo();
    }

    public void childOf(String child, String dad, String mom){
        service.childOf(child, dad, mom);
    }

    public void getInfo(String personStr){
        service.getInfo(personStr);
    }

}
