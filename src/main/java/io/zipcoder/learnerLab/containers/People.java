package io.zipcoder.learnerLab.containers;

import io.zipcoder.learnerLab.models.Person;

import java.util.ArrayList;

public class People {
    private ArrayList<Person> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        return personList.stream()
                .parallel()
                .filter(person -> id == person.getId())
                .findAny()
                .orElse(null);
    }

    public int getCount() {
        return personList.size();
    }

    public Person[] getArray() {
        return personList.toArray(new Person[0]);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
        remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }
}
