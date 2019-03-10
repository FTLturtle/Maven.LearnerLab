package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    private ArrayList<Person> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void add() {

    }

    public Person findById(long id) {
        return null;
    }

    public int getCount() {
        return 0;
    }

    public Person[] getArray() {
        return null;
    }

    public void remove(Person person) {

    }

    public void remove(long id) {

    }

    public void removeAll() {

    }
}
