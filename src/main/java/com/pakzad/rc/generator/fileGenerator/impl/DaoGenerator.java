package com.pakzad.rc.generator.fileGenerator.impl;

import com.pakzad.rc.generator.enums.TemplateTypes;
import com.pakzad.rc.generator.fileGenerator.CodeGenerator;
import com.pakzad.rc.generator.fileService.FileService;
import com.pakzad.rc.generator.fileService.impl.FileServiceImpl;
import com.pakzad.rc.generator.template.TemplateManager;
import com.pakzad.rc.generator.template.impl.DaoTemplateManger;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/8/2015.
 */


public class DaoGenerator extends AbstractCodeGenerator implements CodeGenerator {
    private TemplateManager templateManager = new DaoTemplateManger();
    private FileService fileService = new FileServiceImpl();

    public String getClassName(String entityName) {
        return entityName + "Dao.java";
    }

    @Override
    public TemplateManager getTemplateManager() {
        return templateManager;
    }

    @Override
    public TemplateTypes getTemplateType() {
        return TemplateTypes.Dao;
    }

    @Override
    public FileService getFileService() {
        return fileService;
    }

}
