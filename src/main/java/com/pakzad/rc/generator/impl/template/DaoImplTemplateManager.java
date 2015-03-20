package com.pakzad.rc.generator.impl.template;

import com.pakzad.rc.enums.TemplateTypes;
import com.pakzad.rc.generator.TemplateManager;

import java.util.Map;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/8/2015.
 */


public class DaoImplTemplateManager extends AbstractTemplateManager implements TemplateManager {


    @Override
    public Map<String, Object> getParams(String entityName) {
        final Map<String, Object> params = super.getDefaultParams(entityName);
        params.put("package", TemplateTypes.DaoImpl.getPackageName());
        params.put("fullEntityName", TemplateTypes.DaoImpl.getPackageName() + "." + entityName);
        return params;
    }
}
