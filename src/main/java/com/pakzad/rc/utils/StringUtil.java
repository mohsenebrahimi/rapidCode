package com.pakzad.generator.utils;

import java.nio.file.Paths;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/8/2015.
 */


public class StringUtil {
    public static String getObjectName(String className) {
        return className.substring(0, 1).toLowerCase() + className.substring(1, className.length());
    }

    public static String getClassName(String objectName) {
        return objectName.substring(0, 1).toUpperCase()+ objectName.substring(1, objectName.length());
    }

    public static String getPackageDirectory(String packageName) {
        return packageName.replace('.', '/');
    }


    public static String getAddress(String packageName, String fileName) {

        return Paths.get(getGenerationDirectory() + getPackageDirectory(packageName) + "/" + fileName).toAbsolutePath().toString();
    }


    public static String getGenerationDirectory() {
        return "src/main/java/com/pakzad/rc/generated/";
    }


}
