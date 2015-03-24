package com.pakzad.generator.template.impl;

import com.pakzad.generator.enums.TemplateTypes;
import com.pakzad.generator.entities.FieldInfo;
import com.pakzad.generator.template.TemplateManager;
import com.pakzad.generator.utils.StringUtil;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.*;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/5/2015.
 */
public abstract class AbstractTemplateManager implements TemplateManager {

    public StringWriter getWriter(TemplateTypes templateTypes, Map<String, Object> params) {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();
        Template template = velocityEngine.getTemplate(templateTypes.getTemplateAddress());
        StringWriter writer = new StringWriter();
        template.merge(new VelocityContext(params), writer);
        return writer;
    }


    public Map<String, Object> getDefaultParams(String entityName) {
        Map<String, Object> map = new HashMap<>();
        map.put("entityName", entityName);
        map.put("objectName", StringUtil.getObjectName(entityName));
        map.put("time", new Date().toString());
        map.put("fields", getFields(entityName));

        return map;
    }

    private List<FieldInfo> getFields(String entityName) {
        List<FieldInfo> fields = new ArrayList<FieldInfo>();
        try {
            for (Field f : Class.forName("com.pakzad.entities." + entityName).getDeclaredFields()) {
                fields.add(new FieldInfo(entityName, f.getName(), f.getType().getName(), StringUtil.getClassName(f.getName()), isReference(f), true, isVisible(f)));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fields;
    }

    private boolean isReference(Field filed) {
        if (filed.getType().getPackage().getName().startsWith("java.util") || filed.getType().getPackage().getName().startsWith("java.lang"))
            return false;
        return true;
    }

    private boolean isVisible(Field filed) {
        if (filed.getName().toLowerCase() == "id")
            return false;
        return true;
    }


    public abstract Map<String, Object> getParams(String entityName);


}
