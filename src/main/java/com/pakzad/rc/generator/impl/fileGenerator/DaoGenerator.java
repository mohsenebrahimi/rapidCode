package com.pakzad.rc.generator.impl.fileGenerator;

import com.pakzad.rc.enums.TemplateTypes;
import com.pakzad.rc.generator.CodeGenerator;
import com.pakzad.rc.generator.FileService;
import com.pakzad.rc.generator.TemplateManager;
import com.pakzad.rc.generator.impl.fileService.FileServiceImpl;
import com.pakzad.rc.generator.impl.template.DaoTemplateManger;

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
