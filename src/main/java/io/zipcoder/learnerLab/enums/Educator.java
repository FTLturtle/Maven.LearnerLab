package io.zipcoder.learnerLab.enums;

import io.zipcoder.learnerLab.interfaces.Learner;
import io.zipcoder.learnerLab.interfaces.Teacher;
import io.zipcoder.learnerLab.models.Instructor;

public enum Educator implements Teacher {
    DOLIO(0, "Dolio"), FROILAN(1, "Froilan"), KRIS(2, "Kris"), LEON(3, "Leon"), NHU(4, "Nhu"), WILHEM(5, "Wilhem");

    private final Instructor instructor;

    Educator(long id, String name) {
        instructor = new Instructor(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }

    public double getTotalTeachingTime() {
        return instructor.getTotalTeachingTime();
    }

    public String getName() {
        return instructor.getName();
    }

    public long getId() {
        return instructor.getId();
    }

    public Instructor getInstructor() {
        return instructor;
    }
}