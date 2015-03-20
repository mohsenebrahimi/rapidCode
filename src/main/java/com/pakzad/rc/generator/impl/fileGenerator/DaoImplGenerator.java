package com.pakzad.rc.generator.impl.fileGenerator;

import com.pakzad.rc.enums.TemplateTypes;
import com.pakzad.rc.generator.CodeGenerator;
import com.pakzad.rc.generator.FileService;
import com.pakzad.rc.generator.TemplateManager;
import com.pakzad.rc.generator.impl.fileService.FileServiceImpl;
import com.pakzad.rc.generator.impl.template.DaoImplTemplateManager;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/5/2015.
 */
public class DaoImplGenerator extends AbstractCodeGenerator implements CodeGenerator {
    private TemplateManager templateManager = new DaoImplTemplateManager();
    private FileService fileService = new FileServiceImpl();


    @Override
    public String getClassName(String entityName) {
        return entityName + "DaoImpl.java";
    }

    @Override
    public TemplateManager getTemplateManager() {
        return templateManager;
    }

    @Override
    public TemplateTypes getTemplateType() {
        return TemplateTypes.DaoImpl;
    }

    @Override
    public FileService getFileService() {
        return fileService;
    }
}
