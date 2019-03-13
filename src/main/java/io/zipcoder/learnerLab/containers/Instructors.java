package io.zipcoder.learnerLab.containers;

import io.zipcoder.learnerLab.enums.Educator;
import io.zipcoder.learnerLab.models.Instructor;
import java.util.ArrayList;

public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        personList = getPopulatedPersonList();
    }

    private ArrayList<Instructor> getPopulatedPersonList() {
        ArrayList<Instructor> instructors = new ArrayList<>();
        for (Educator educator : Educator.values()) {
            instructors.add(educator.getInstructor());
        }
        return instructors;
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
