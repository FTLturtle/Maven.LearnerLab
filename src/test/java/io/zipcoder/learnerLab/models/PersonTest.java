package io.zipcoder.learnerLab.models;

import io.zipcoder.learnerLab.models.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void constructorTest1() {
        // Given
        long expectedID = 1;
        Person person = new Person(expectedID);

        // When
        long actualID = person.getId();

        // Then
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void constructorTest2() {
        // Given
        long expectedID = 2;
        Person person = new Person(expectedID);

        // When
        long actualID = person.getId();

        // Then
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void setNameTest1() {
        // Given
        Person person = new Person(0);
        String expectedName = "Lengthy Leon";

        // When
        person.setName(expectedName);
        String actualName = person.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest2() {
        // Given
        Person person = new Person(0);
        String expectedName = "Learner Lab";

        // When
        person.setName(expectedName);
        String actualName = person.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}