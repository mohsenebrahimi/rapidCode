package com.pakzad.rc.launcher;

import com.pakzad.rc.generator.CodeGenerator;
import com.pakzad.rc.generator.impl.fileGenerator.*;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/8/2015.
 */
public class MainClass {
    public static void main(String[] args) {
        CodeGenerator daoImplGenerator = new DaoGenerator();
        CodeGenerator daoGenerator = new DaoImplGenerator();
        CodeGenerator serviceGenerator = new ServiceGenerator();
        CodeGenerator serviceImplGenerator = new ServiceImplGenerator();
        CodeGenerator controllerGenerator = new ControllerGenerator();
        CodeGenerator webMasterGenerator = new WebMasterGenerator();
        CodeGenerator webAddGenerator = new WebAddGenerator();
        CodeGenerator webEditGenerator = new WebEditGenerator();

        for (String entityName : getListOfFiles(getEntitiesDirectory(null))) {
            /*daoImplGenerator.create(entityName);
            daoGenerator.create(entityName);
            serviceGenerator.create(entityName);
            serviceImplGenerator.create(entityName);
            controllerGenerator.create(entityName);*/
            webMasterGenerator.create(entityName);
            webAddGenerator.create(entityName);
            webEditGenerator.create(entityName);
        }
    }

    private static File getEntitiesDirectory(String location) {
        return new File(Paths.get("src/main/java/com/pakzad/rc/entities").toAbsolutePath().toString());
    }

    public static List<String> getListOfFiles(final File folder) {
        List<String> allFiles = new ArrayList<>();
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                getListOfFiles(fileEntry);
            } else {
                allFiles.add(fileEntry.getName().substring(0, fileEntry.getName().indexOf('.')));
            }
        }
        return allFiles;
    }


}
