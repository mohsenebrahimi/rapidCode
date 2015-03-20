package com.pakzad.rc.generator.impl.template;

import com.pakzad.rc.enums.TemplateTypes;
import com.pakzad.rc.generator.TemplateManager;

import java.util.Map;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/12/2015.
 */
public class WebEditTemplateManger extends AbstractTemplateManager implements TemplateManager {
    @Override
    public Map<String, Object> getParams(String entityName) {
        final Map<String, Object> params = super.getDefaultParams(entityName);
        params.put("package", TemplateTypes.WebEdit.getPackageName());
        params.put("fullEntityName", TemplateTypes.WebEdit.getPackageName() + "." + entityName);
        params.put("objectControllerName", "selected");
        params.put("page", "Edit");
        return params;
    }
}
