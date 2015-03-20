package com.pakzad.rc.generator.impl.template;

import com.pakzad.rc.enums.TemplateTypes;
import com.pakzad.rc.generator.TemplateManager;
import com.pakzad.rc.generator.impl.template.AbstractTemplateManager;

import java.util.Map;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/9/2015.
 */
public class ServiceTemplateManager extends AbstractTemplateManager implements TemplateManager {
    @Override
    public Map<String, Object> getParams(String entityName) {
        final Map<String, Object> params = super.getDefaultParams(entityName);
        params.put("package", TemplateTypes.Service.getPackageName());
        params.put("fullEntityName", TemplateTypes.Service.getPackageName() + "." + entityName);
        return params;

    }
}
