package io.zipcoder.learnerLab;

import io.zipcoder.learnerLab.models.Instructor;
import io.zipcoder.learnerLab.models.Student;
import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void getInstanceTest() {
        // Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();

        // Then
        Assert.assertNotNull(zipCodeWilmington);
    }

    @Test
    public void hostLectureTeacherTest() {
        // Given
        double lectureLength = 40.0;
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Student[] studentArray = zipCodeWilmington.getStudentsArray();
        double expectedHours = studentArray[0].getTotalStudyTime() + lectureLength / zipCodeWilmington.getStudentsArray().length;

        // When
        zipCodeWilmington.hostLecture(new Instructor(0), lectureLength);
        studentArray = zipCodeWilmington.getStudentsArray();
        double actualHours = studentArray[0].getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedHours, actualHours, .000001);
    }

    @Test
    public void hostLectureIdTest() {
        // Given
        double lectureLength = 40.0;
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Student[] studentArray = zipCodeWilmington.getStudentsArray();
        double expectedHours = studentArray[0].getTotalStudyTime() + lectureLength / zipCodeWilmington.getStudentsArray().length;

        // When
        zipCodeWilmington.hostLecture(0, lectureLength);
        studentArray = zipCodeWilmington.getStudentsArray();
        double actualHours = studentArray[0].getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedHours, actualHours, .000001);
    }

    @Test
    public void hostLectureIdTest2() {
        // Given
        double lectureLength = 40.0;
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Instructor[] instructorArray = zipCodeWilmington.getInstructorsArray();
        double expectedHours = instructorArray[0].getTotalTeachingTime() + lectureLength;

        // When
        zipCodeWilmington.hostLecture(0, lectureLength);
        instructorArray = zipCodeWilmington.getInstructorsArray();
        double actualHours = instructorArray[0].getTotalTeachingTime();

        // Then
        Assert.assertEquals(expectedHours, actualHours, .000001);
    }
}