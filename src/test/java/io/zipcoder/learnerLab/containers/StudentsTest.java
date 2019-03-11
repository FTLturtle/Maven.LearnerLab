package io.zipcoder.learnerLab.containers;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstance() {
        Students students = Students.getInstance();
        System.out.println(students.getCount());
    }
}