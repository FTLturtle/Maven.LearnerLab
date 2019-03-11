package io.zipcoder.learnerLab.containers;

import io.zipcoder.learnerLab.models.Person;
import io.zipcoder.learnerLab.models.Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students() {
        personList = getPopulatedPersonList();
    }

    private ArrayList<Person> getPopulatedPersonList() {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File("/Users/sunhyunmiller/Dev/Maven.LearnerLab/src/main/java/io/zipcoder/learnerLab/containers/studentNames.txt");

        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        long idCount = 0;
        while (sc != null && sc.hasNextLine()) {
            students.add(new Student(idCount, sc.nextLine()));
            idCount++;
        }
        return new ArrayList<>(students);
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
