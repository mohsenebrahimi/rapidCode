package com.pakzad.generator.fileService.impl;

import com.pakzad.generator.fileService.FileService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/5/2015.
 */
public class FileServiceImpl implements FileService {
    public void createFile(String fileAddress, String fileContent) throws IOException {
        FileWriter fileWriter = new FileWriter(fileAddress, true);
        fileWriter.write(fileContent);
        fileWriter.close();
    }

    public boolean makeDirectories(String address) {
        return new File(address).mkdirs();
    }

}
