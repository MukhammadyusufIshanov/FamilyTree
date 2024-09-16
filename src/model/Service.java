package model;

import java.sql.SQLData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {
    private int idPerson;
    private Tree<Person> tree;


    public Service() {
        tree = new Tree<>();
    }

    public void addPerson(String gender, String name, int birthYear){
        Person person = new Person(idPerson++, gender, name, birthYear);
        tree.addToList(person);
    }

    public String getHumansInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список людей:\n");
        for (Person person: tree){
            stringBuilder.append(person.getInfo());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName(){
        Collections.sort(tree.itemList);
    }

    public void sortByYear(){
        Collections.sort(tree.itemList, new PersonComparatorByYear<>());
    }

    public void childOf(String child,String dad, String mom){
        try {
            Person childP = toPerson(child);
            Person dadP = toPerson(dad);
            Person momP = toPerson(mom);
            childP.parents[0]= dad.toString();
            childP.parents[1]= mom.toString();
            dadP.children.add(childP);
            momP.children.add(childP);
            } catch (Exception e) {
            System.out.println("Человек не найден");
        }

    }

    public Person toPerson(String personString){
        try {
        for (Person person: tree.itemList)  {
            if (personString.equals(person.getName()))
                return person;
        }} catch (Exception e) {
            System.out.println("Человек не найден");
        }

        return null;

    }

    public void getInfo(String personStr){
        try {
            Person personP = toPerson(personStr);
            System.out.println(personP.getInfo());
            } catch (Exception e) {
            System.out.println("Человек не найден");
        }

    }
}
