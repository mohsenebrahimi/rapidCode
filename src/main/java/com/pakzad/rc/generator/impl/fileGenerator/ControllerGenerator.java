package com.pakzad.rc.generator.impl.fileGenerator;

import com.pakzad.rc.enums.TemplateTypes;
import com.pakzad.rc.generator.CodeGenerator;
import com.pakzad.rc.generator.FileService;
import com.pakzad.rc.generator.TemplateManager;
import com.pakzad.rc.generator.impl.fileService.FileServiceImpl;
import com.pakzad.rc.generator.impl.template.ControllerTemplateManager;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/9/2015.
 */


public class ControllerGenerator extends AbstractCodeGenerator implements CodeGenerator {
    private TemplateManager templateManager = new ControllerTemplateManager();
    private FileService fileService = new FileServiceImpl();

    @Override
    public String getClassName(String entityName) {
        return entityName + "Controller.java";
    }

    @Override
    public TemplateManager getTemplateManager() {
        return templateManager;
    }

    @Override
    public TemplateTypes getTemplateType() {
        return TemplateTypes.Controller;
    }

    @Override
    public FileService getFileService() {
        return fileService;
    }
}
