package io.zipcoder.learnerLab.utilities;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Scanner;

public class FileScannerGeneratorTest {

    @Test
    public void getScannerOfFileTest1() {
        File file = new File("*&450975(&^%0&%9^%0*&5(*");
        Scanner sc = FileScannerGenerator.getScannerOfFile(file);
        Assert.assertNull(sc);
    }

    @Test
    public void getScannerOfFileTest2() {
        File file = new File("resource/studentNames.txt");
        Scanner sc = FileScannerGenerator.getScannerOfFile(file);
        Assert.assertNotNull(sc);
    }
}