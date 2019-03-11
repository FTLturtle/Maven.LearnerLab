package io.zipcoder.learnerLab.containers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstance() {
        // Given
        int expectedCount = 40;

        // When
        Students students = Students.getInstance();
        int actualCount = students.getCount();

        // Then
        Assert.assertEquals(expectedCount, actualCount);
        }
}