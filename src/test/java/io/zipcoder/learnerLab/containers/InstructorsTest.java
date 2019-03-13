package io.zipcoder.learnerLab.containers;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void getInstance() {
        // Given
        int expectedCount = 6;

        // When
        Instructors instructors = Instructors.getInstance();
        int actualCount = instructors.getCount();

        // Then
        Assert.assertEquals(expectedCount, actualCount);
    }
}