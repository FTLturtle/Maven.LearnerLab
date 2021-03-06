package io.zipcoder.learnerLab.models;

import io.zipcoder.learnerLab.interfaces.Learner;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id) {
        super(id);
    }

    public Student(long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
