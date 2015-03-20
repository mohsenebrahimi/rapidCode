package com.pakzad.rc.generator.impl.fileGenerator;

import com.pakzad.rc.enums.TemplateTypes;
import com.pakzad.rc.generator.CodeGenerator;
import com.pakzad.rc.generator.FileService;
import com.pakzad.rc.generator.TemplateManager;
import com.pakzad.rc.generator.impl.fileService.FileServiceImpl;
import com.pakzad.rc.generator.impl.template.WebMasterTemplateManger;
import com.pakzad.rc.utils.StringUtil;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/12/2015.
 */
public class WebMasterGenerator extends AbstractCodeGenerator implements CodeGenerator {
    private TemplateManager templateManager = new WebMasterTemplateManger();
    private FileService fileService = new FileServiceImpl();

    @Override
    public String getClassName(String entityName) {
        return StringUtil.getObjectName(entityName) + ".xhtml";
    }

    @Override
    public TemplateManager getTemplateManager() {
        return templateManager;
    }

    @Override
    public TemplateTypes getTemplateType() {
        return TemplateTypes.WebMaster;
    }

    @Override
    public FileService getFileService() {
        return fileService;
    }

}
