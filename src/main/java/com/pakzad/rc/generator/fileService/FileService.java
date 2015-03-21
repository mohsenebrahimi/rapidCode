package com.pakzad.rc.generator.fileService;

import java.io.IOException;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/5/2015.
 */
public interface FileService {
    void createFile(String fileAddress, String fileContent) throws IOException;

    boolean makeDirectories(String address);
}
