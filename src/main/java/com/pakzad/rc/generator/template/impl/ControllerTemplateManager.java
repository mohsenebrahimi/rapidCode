package com.pakzad.generator.template.impl;

import com.pakzad.generator.enums.TemplateTypes;
import com.pakzad.generator.template.TemplateManager;

import java.util.Map;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/9/2015.
 */
public class ControllerTemplateManager extends AbstractTemplateManager implements TemplateManager {
    @Override
    public Map<String, Object> getParams(String entityName) {
        final Map<String, Object> params = super.getDefaultParams(entityName);
        params.put("package", TemplateTypes.Controller.getPackageName());
        params.put("fullEntityName", TemplateTypes.Controller.getPackageName() + "." + entityName);
        return params;

    }
}
