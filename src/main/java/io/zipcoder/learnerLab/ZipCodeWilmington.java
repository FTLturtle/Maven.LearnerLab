package io.zipcoder.learnerLab;

import io.zipcoder.learnerLab.containers.Instructors;
import io.zipcoder.learnerLab.containers.Students;
import io.zipcoder.learnerLab.interfaces.Teacher;
import io.zipcoder.learnerLab.models.Instructor;
import io.zipcoder.learnerLab.models.Student;

public class ZipCodeWilmington {
    private static ZipCodeWilmington INSTANCE;
    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington() {
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }

    public static ZipCodeWilmington getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ZipCodeWilmington();
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(new Student[0]), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        instructors.findById(id).lecture(students.getArray(new Student[0]), numberOfHours);
    }

    public Student[] getStudentsArray() {
        return students.getArray(new Student[0]);
    }

    public Instructor[] getInstructorsArray() {
        return instructors.getArray(new Instructor[0]);
    }
}
