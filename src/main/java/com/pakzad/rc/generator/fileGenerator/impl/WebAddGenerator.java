package com.pakzad.generator.fileGenerator.impl;

import com.pakzad.generator.enums.TemplateTypes;
import com.pakzad.generator.fileGenerator.CodeGenerator;
import com.pakzad.generator.fileService.FileService;
import com.pakzad.generator.fileService.impl.FileServiceImpl;
import com.pakzad.generator.template.TemplateManager;
import com.pakzad.generator.template.impl.WebAddTemplateManger;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/12/2015.
 */
public class WebAddGenerator extends AbstractCodeGenerator implements CodeGenerator {
    private TemplateManager templateManager = new WebAddTemplateManger();
    private FileService fileService = new FileServiceImpl();

    @Override
    public String getClassName(String entityName) {
        return "add" + entityName + ".xhtml";
    }

    @Override
    public TemplateManager getTemplateManager() {
        return templateManager;
    }

    @Override
    public TemplateTypes getTemplateType() {
        return TemplateTypes.WebAdd;
    }

    @Override
    public FileService getFileService() {
        return fileService;
    }

}
