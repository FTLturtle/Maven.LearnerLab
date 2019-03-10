package io.zipcoder.learnerLab.models;

import io.zipcoder.learnerLab.interfaces.Learner;
import io.zipcoder.learnerLab.interfaces.Teacher;

public class Instructor extends Person implements Teacher {
    public Instructor(long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
