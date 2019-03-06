package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void implementationTest() {
        // Given
        Student student = new Student(0);

        // Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void inheritanceTest() {
        // Given
        Student student = new Student(0);

        // Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest1() {
        // Given
        Student student = new Student(0);
        double expectedTotalStudyTime = 20.0;

        // When
        student.learn(expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void learnTest2() {
        // Given
        Student student = new Student(0);
        double expectedTotalStudyTime = 30.5;

        // When
        student.learn(expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }
}