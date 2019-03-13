package io.zipcoder.learnerLab.containers;

import io.zipcoder.learnerLab.models.Instructor;
import io.zipcoder.learnerLab.utilities.FileScannerGenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        personList = getPopulatedPersonList();
    }

    private ArrayList<Instructor> getPopulatedPersonList() {
        ArrayList<Instructor> instructors = new ArrayList<>();
        File file = new File("resource/instructorNames.txt");
        Scanner sc = FileScannerGenerator.getScannerOfFile(file);
        long idCount = 0;
        while (sc != null && sc.hasNextLine()) {
            instructors.add(new Instructor(idCount, sc.nextLine()));
            idCount++;
        }
        return instructors;
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
