package model;

import java.util.ArrayList;
import java.util.List;

public  class Person implements Comparable<Person>, TreeItem<Person> {
    private int id;
    private String name;
    private String gender;
     String[] parents = new String[2];
     List<Person> children = new ArrayList<>();
    private int birthYear;


    public Person(int id,String gender, String name, int birthYear) {
        this.birthYear=birthYear;
        this.gender=gender;
        this.name = name;
        this.id=id;
        parents = new String[2];
        children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return birthYear;
    }

    public String getInfo(){
        return "Имя: " + name + " | Пол: " + gender + " | Год рождения: " + birthYear + " | Родители " + parents[0] + " и " + parents[1] +
                " | Дети: " + children;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }


}
