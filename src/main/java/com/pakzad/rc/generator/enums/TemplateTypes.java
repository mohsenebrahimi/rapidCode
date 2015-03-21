package com.pakzad.rc.generator.enums;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/5/2015.
 */
public enum TemplateTypes {
    Dao("./src/main/resources/templates/dao.vm", "com.hamraz.tax.dao"),
    DaoImpl("./src/main/resources/templates/daoImpl.vm", "com.hamraz.tax.dao.impl"),
    Service("./src/main/resources/templates/service.vm", "com.hamraz.tax.service"),
    ServiceImpl("./src/main/resources/templates/serviceImpl.vm", "com.hamraz.tax.service.impl"),
    Controller("./src/main/resources/templates/controller.vm", "com.hamraz.tax.controllers"),
    WebMaster("./src/main/resources/templates/webMaster.vm", "com.hamraz.tax.web"),
    WebAdd("./src/main/resources/templates/webAdd.vm", "com.hamraz.tax.web"),
    WebEdit("./src/main/resources/templates/webEdit.vm", "com.hamraz.tax.web");



    private final String templateAddress;
    private final String packageName;


    private TemplateTypes(String templateAddress, String packageName) {
        this.templateAddress = templateAddress;
        this.packageName = packageName;
    }

    public String getTemplateAddress() {
        return templateAddress;
    }

    public String getPackageName() {
        return packageName;
    }
}
