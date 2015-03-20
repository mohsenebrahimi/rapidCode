package com.pakzad.rc.generator.impl.template;

import com.pakzad.rc.enums.TemplateTypes;
import com.pakzad.rc.generator.TemplateManager;

import java.util.Map;
import java.util.Objects;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/12/2015.
 */
public class WebMasterTemplateManger extends AbstractTemplateManager implements TemplateManager {
    @Override
    public Map<String, Object> getParams(String entityName) {
        final Map<String, Object> params = super.getDefaultParams(entityName);
        params.put("package", TemplateTypes.WebMaster.getPackageName());
        params.put("fullEntityName", TemplateTypes.WebMaster.getPackageName() + "." + entityName);
        params.put("objectControllerName", "searched");
        params.put("page", "");
        return params;
    }
}
