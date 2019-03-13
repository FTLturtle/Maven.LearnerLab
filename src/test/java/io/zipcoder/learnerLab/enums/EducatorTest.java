package io.zipcoder.learnerLab.enums;

import io.zipcoder.learnerLab.interfaces.Teacher;
import io.zipcoder.learnerLab.models.Student;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void implementationTest() {
        // Given
        Educator educator = Educator.DOLIO;

        // Then
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void teachTest1() {
        // Given
        Educator educator = Educator.FROILAN;
        Student student = new Student(0);
        double expectedTotalStudyTime = 10.0;

        // When
        educator.teach(student, expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void teachTest2() {
        // Given
        Educator educator = Educator.KRIS;
        Student student = new Student(0);
        double expectedTotalStudyTime = 19.35;

        // When
        educator.teach(student, expectedTotalStudyTime);
        double actualTotalStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void lectureTest1() {
        // Given
        Educator educator = Educator.LEON;
        Student[] students = {new Student(0)};
        double expectedTotalStudyTime = 10.0;

        // When
        educator.lecture(students, expectedTotalStudyTime);
        double actualTotalStudyTime = students[0].getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void lectureTest2() {
        // Given
        Educator educator = Educator.NHU;
        Student[] students = {new Student(0), new Student(2)};
        double teachTime = 20.0;
        double expectedTotalStudyTime = teachTime / students.length;

        // When
        educator.lecture(students, teachTime);
        double actualTotalStudyTime = students[0].getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void lectureTest3() {
        // Given
        Educator educator = Educator.WILHEM;
        Student[] students = {new Student(1), new Student(2), new Student(3)};
        double teachTime = 25.0;
        double expectedTotalStudyTime = teachTime / students.length;

        // When
        educator.lecture(students, teachTime);
        double actualTotalStudyTime = students[0].getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, .000001);
    }

    @Test
    public void lectureTest4() {
        // Given
        Educator educator = Educator.valueOf("NHU");
        Student[] students = {new Student(1), new Student(2), new Student(3)};
        double teachTime = 25.0;
        double expectedTeachTime = educator.getTotalTeachingTime() + teachTime;

        // When
        educator.lecture(students, teachTime);
        double actualTeachTime = educator.getTotalTeachingTime();

        // Then
        Assert.assertEquals(expectedTeachTime, actualTeachTime, .000001);
    }

    @Test
    public void getNameTest1() {
        // Given
        Educator educator = Educator.FROILAN;
        String expectedName = "Froilan";

        // When
        String actualName = educator.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getIdTest2() {
        // Given
        Educator educator = Educator.WILHEM;
        long expectedId = 5;

        // When
        long actualId = educator.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }
}