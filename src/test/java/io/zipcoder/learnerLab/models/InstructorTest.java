package io.zipcoder.learnerLab.models;

import io.zipcoder.learnerLab.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void implementationTest() {
        // Given
        Instructor instructor = new Instructor(0);

        // Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        // Given
        Instructor instructor = new Instructor(0);

        // Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest1() {
        // Given
        Instructor instructor = new Instructor(1);
        Student student = new Student(0);
        double expectedTotalStudyTime = 10.0;

        // When
        instructor.teach(student, expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void teachTest2() {
        // Given
        Instructor instructor = new Instructor(1);
        Student student = new Student(0);
        double expectedTotalStudyTime = 19.35;

        // When
        instructor.teach(student, expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void lectureTest1() {
        // Given
        Instructor instructor = new Instructor(1);
        Student[] students = {new Student(0)};
        double expectedTotalStudyTime = 10.0;

        // When
        instructor.lecture(students, expectedTotalStudyTime);
        double actualTotalStudyTime = students[0].getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void lectureTest2() {
        // Given
        Instructor instructor = new Instructor(1);
        Student[] students = {new Student(0), new Student(2)};
        double teachTime = 20.0;
        double expectedTotalStudyTime = teachTime / students.length;

        // When
        instructor.lecture(students, teachTime);
        double actualTotalStudyTime = students[0].getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void lectureTest3() {
        // Given
        Instructor instructor = new Instructor(0);
        Student[] students = {new Student(1), new Student(2), new Student(3)};
        double teachTime = 25.0;
        double expectedTotalStudyTime = teachTime / students.length;

        // When
        instructor.lecture(students, teachTime);
        double actualTotalStudyTime = students[0].getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }
}