package com.pakzad.generator.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/8/2015.
 */


public class FileUtil {
    public static boolean makeDirectories(String address) {
        return new File(address).mkdirs();
    }

    public static void createFile(String fileAddress, String fileContent) throws IOException {
        FileWriter fileWriter = new FileWriter(fileAddress, true);
        fileWriter.write(fileContent);
        fileWriter.close();
    }
}
