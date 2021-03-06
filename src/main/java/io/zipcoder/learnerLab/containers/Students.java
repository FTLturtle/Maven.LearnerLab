package io.zipcoder.learnerLab.containers;

import io.zipcoder.learnerLab.models.Student;
import io.zipcoder.learnerLab.utilities.FileScannerGenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        personList = getPopulatedPersonList();
    }

    private ArrayList<Student> getPopulatedPersonList() {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File("resource/studentNames.txt");
        Scanner sc = FileScannerGenerator.getScannerOfFile(file);
        long idCount = 0;
        while (sc != null && sc.hasNextLine()) {
            students.add(new Student(idCount, sc.nextLine()));
            idCount++;
        }
        return students;
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
