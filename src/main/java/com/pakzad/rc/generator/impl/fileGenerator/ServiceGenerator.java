package com.pakzad.rc.generator.impl.fileGenerator;

import com.pakzad.rc.enums.TemplateTypes;
import com.pakzad.rc.generator.CodeGenerator;
import com.pakzad.rc.generator.FileService;
import com.pakzad.rc.generator.TemplateManager;
import com.pakzad.rc.generator.impl.fileService.FileServiceImpl;
import com.pakzad.rc.generator.impl.template.ServiceTemplateManager;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/9/2015.
 */


public class ServiceGenerator extends AbstractCodeGenerator implements CodeGenerator {
    private TemplateManager templateManager = new ServiceTemplateManager();
    private FileService fileService = new FileServiceImpl();


    @Override
    public String getClassName(String entityName) {
        return entityName + "Service.java";
    }

    @Override
    public TemplateManager getTemplateManager() {
        return templateManager;
    }

    @Override
    public TemplateTypes getTemplateType() {
        return TemplateTypes.Service;
    }

    @Override
    public FileService getFileService() {
        return fileService;
    }

}
