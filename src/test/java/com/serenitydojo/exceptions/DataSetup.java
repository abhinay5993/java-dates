package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataSetup {
    public static void loadTestData() throws ClientDataCouldNotBeLoadedException {
        String fileContents = null;
        String testDataFilename = "/resources/test-data/sample-data.txt";
        try {
            fileContents = Files.readString(Paths.get(testDataFilename));
        } catch (IOException e) {
            // Uncomment to throw a custom exception
            // throw new ClientDataCouldNotBeLoadedException("Could not load test data from data file " + testDataFilename, e);
        }
        System.out.println(fileContents);
    }
}
