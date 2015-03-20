package com.pakzad.rc.generator.impl.fileGenerator;

import com.pakzad.rc.enums.TemplateTypes;
import com.pakzad.rc.generator.CodeGenerator;
import com.pakzad.rc.generator.FileService;
import com.pakzad.rc.generator.TemplateManager;
import com.pakzad.rc.utils.FileUtil;
import com.pakzad.rc.utils.StringUtil;

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
            if (!(new File(Paths.get(StringUtil.getGenerationDirectory() + StringUtil.getPackageDirectory(templateTypes.getPackageName())).toAbsolutePath().toString()).exists()))
                FileUtil.makeDirectories(Paths.get(StringUtil.getGenerationDirectory() + StringUtil.getPackageDirectory(templateTypes.getPackageName())).toAbsolutePath().toString());

            getFileService().createFile(StringUtil.getAddress(templateTypes.getPackageName(), getClassName(entityName)), getTemplateManager().getWriter(templateTypes, map).toString());
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
