package io.zipcoder.learnerLab.containers;

import io.zipcoder.learnerLab.containers.People;
import io.zipcoder.learnerLab.models.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PeopleTest {

    @Test
    public void constructorTest1() {
        // Given
        People people = new People();

        // Then
        Assert.assertNotNull(people);
    }

    @Test
    public void constructorTest2() {
        // Given
        People people = new People();

        // Then
        Assert.assertNotNull(people.getArray());
    }
    
    @Test
    public void addTest() {
        // Given
        int id = 1;
        Person expectedPerson = new Person(id);
        People people = new People();

        // When
        people.add(expectedPerson);
        Person actualPerson = people.findById(id);

        // Then
        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void findByIdTest() {
        // Given
        int id = 2;
        Person expectedPerson = new Person(id);
        People people = new People();

        // When
        people.add(expectedPerson);
        Person actualPerson = people.findById(id);

        // Then
        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void getCountTest1() {
        // Given
        int id = 98;
        Person person = new Person(id);
        People people = new People();
        int expectedCount = 1;

        // When
        people.add(person);
        int actualCount = people.getCount();

        // Then
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getCountTest2() {
        // Given
        Person[] personArray = {new Person(1), new Person(2), new Person(3), new Person(4)};
        People people = new People(new ArrayList<>(Arrays.asList(personArray)));
        int expectedCount = 4;

        // When
        int actualCount = people.getCount();

        // Then
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getArrayTest() {
        // Given
        Person[] expectedPersonArray = {new Person(345), new Person(456), new Person(87), new Person(234)};
        People people = new People(new ArrayList<>(Arrays.asList(expectedPersonArray)));

        // When
        Person[] actualPersonArray = people.getArray();

        // Then
        Assert.assertArrayEquals(expectedPersonArray, actualPersonArray);
    }

    @Test
    public void removeByIdTest() {
        // Given
        Person[] personArray = {new Person(93), new Person(-3847), new Person(92384), new Person(88)};
        People people = new People(new ArrayList<>(Arrays.asList(personArray)));
        int id = 0;
        Person person = new Person(id);
        people.add(person);

        // When
        people.remove(id);
        Person foundPerson = people.findById(id);

        // Then
        Assert.assertNull(foundPerson);
    }

    @Test
    public void removeByPersonTest() {
        // Given
        Person[] personArray = {new Person(9), new Person(20), new Person(834), new Person(9876)};
        People people = new People(new ArrayList<>(Arrays.asList(personArray)));
        int id = 0;
        Person person = new Person(id);
        people.add(person);

        // When
        people.remove(person);
        Person foundPerson = people.findById(id);

        // Then
        Assert.assertNull(foundPerson);
    }

    @Test
    public void removeAllTest() {
        // Given
        Person[] personArray = {new Person(7), new Person(11), new Person(-5), new Person(1019)};
        People people = new People(new ArrayList<>(Arrays.asList(personArray)));
        int expectedCount = 0;

        // When
        people.removeAll();
        int actualCount = people.getCount();

        // Then
        Assert.assertEquals(expectedCount, actualCount);
    }
}