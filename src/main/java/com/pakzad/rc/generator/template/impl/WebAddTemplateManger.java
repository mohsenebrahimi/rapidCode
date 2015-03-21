package com.pakzad.rc.generator.template.impl;

import com.pakzad.rc.generator.enums.TemplateTypes;
import com.pakzad.rc.generator.template.TemplateManager;

import java.util.Map;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/12/2015.
 */
public class WebAddTemplateManger extends AbstractTemplateManager implements TemplateManager {
    @Override
    public Map<String, Object> getParams(String entityName) {
        final Map<String, Object> params = super.getDefaultParams(entityName);
        params.put("package", TemplateTypes.WebAdd.getPackageName());
        params.put("fullEntityName", TemplateTypes.WebAdd.getPackageName() + "." + entityName);
        params.put("objectControllerName", "inserted");
        params.put("page", "Add");
        return params;
    }
}
