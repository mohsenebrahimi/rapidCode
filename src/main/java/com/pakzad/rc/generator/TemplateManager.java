package com.pakzad.rc.generator;

import com.pakzad.rc.enums.TemplateTypes;

import java.io.StringWriter;
import java.util.Map;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/5/2015.
 */
public interface TemplateManager {
    StringWriter getWriter(TemplateTypes templateTypes, Map<String, Object> params);

    Map<String, Object> getParams(String entityName);

}
