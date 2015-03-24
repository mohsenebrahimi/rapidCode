package com.pakzad.generator.fileGenerator.impl;

import com.pakzad.generator.enums.TemplateTypes;
import com.pakzad.generator.fileGenerator.CodeGenerator;
import com.pakzad.generator.fileService.FileService;
import com.pakzad.generator.template.TemplateManager;
import com.pakzad.generator.utils.FileUtil;
import com.pakzad.generator.utils.StringUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/9/2015.
 */


public abstract class AbstractCodeGenerator implements CodeGenerator {

    @Override
    public void create(String entityName) {
        createFile(getTemplateType(), entityName, getTemplateManager().getParams(entityName));
    }


    private void createFile(TemplateTypes templateTypes, String entityName, Map<String, Object> map) {
        try {
            String directoryName = StringUtil.getGenerationDirectory() + StringUtil.getPackageDirectory(templateTypes.getPackageName());

            if (!(new File(Paths.get(directoryName).toAbsolutePath().toString()).exists()))
                FileUtil.makeDirectories(Paths.get(directoryName).toAbsolutePath().toString());

            getFileService().createFile(StringUtil.makeFileAddress(templateTypes.getPackageName(), getClassName(entityName)), getTemplateManager().getWriter(templateTypes, map).toString());
        } catch (IOException e) {
            //todo: throw new GeneratingException();
            e.printStackTrace();
        }
    }

    public abstract String getClassName(String entityName);

    public abstract TemplateManager getTemplateManager();

    public abstract TemplateTypes getTemplateType();

    public abstract FileService getFileService();
}
