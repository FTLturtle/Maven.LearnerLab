package io.zipcoder.learnerLab.models;

import io.zipcoder.learnerLab.interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void learnTest3() {
        // Given
        Student student = new Student(-1, "Bob");
        double expectedTotalStudyTime = 400.0;

        // When
        student.learn(expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void learnTest4() {
        // Given
        Student student = new Student(90, "Bob");
        double expectedTotalStudyTime = 5786.98;

        // When
        student.learn(expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }
}