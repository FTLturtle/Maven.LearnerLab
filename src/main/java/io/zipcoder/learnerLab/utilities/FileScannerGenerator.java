package io.zipcoder.learnerLab.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerGenerator {
    public static Scanner getScannerOfFile(File file) {
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sc;
    }
}