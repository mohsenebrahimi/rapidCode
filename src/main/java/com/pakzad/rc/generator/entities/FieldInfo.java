package com.pakzad.rc.generator.entities;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/12/2015.
 */
public class FieldInfo {
    private String entityName;
    private String name;
    private String type;
    private String className;
    private boolean isReference;
    private boolean required;
    private boolean visible;

    public FieldInfo(String entityName, String name, String type,String className, boolean isReference, boolean required, boolean visible) {
        this.entityName = entityName;
        this.name = name;
        this.type = type;
        this.isReference = isReference;
        this.required = required;
        this.visible = visible;
        this.className=className;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isReference() {
        return isReference;
    }

    public void setReference(boolean isReference) {
        this.isReference = isReference;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
