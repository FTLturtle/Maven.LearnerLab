package io.zipcoder.learnerLab.models;

import io.zipcoder.learnerLab.interfaces.Learner;
import io.zipcoder.learnerLab.interfaces.Teacher;

public class Instructor extends Person implements Teacher {
    private double totalTeachingTime;

    public Instructor(long id) {
        super(id);
    }

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        totalTeachingTime += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
        totalTeachingTime += numberOfHours;
    }

    public double getTotalTeachingTime() {
        return totalTeachingTime;
    }
}
