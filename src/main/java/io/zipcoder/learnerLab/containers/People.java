package io.zipcoder.learnerLab.containers;

import io.zipcoder.learnerLab.models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class People<T extends Person> {
    protected List<T> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<T> personList) {
        this.personList = personList;
    }

    public void add(T person) {
        personList.add(person);
    }

    public T findById(long id) {
        return personList.stream()
                .parallel()
                .filter(person -> id == person.getId())
                .findAny()
                .orElse(null);
    }

    public int getCount() {
        return personList.size();
    }

    @SuppressWarnings("unchecked")
    public T[] getArray(T[] arrayType) {
        Object[] objectArray = personList.toArray(new Object[0]);
        return (T[]) Arrays.copyOf(objectArray, objectArray.length, arrayType.getClass());
    }

    public void remove(T person) {
        personList.remove(person);
    }

    public void remove(long id) {
        remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }
}
