package com.pakzad.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * * @author ramin pakzad (ramin.highborn@gmail.com) on 2/17/2015.
 */
@MappedSuperclass
public abstract class DomainObject {
    private Date insertDate;
    /*private Date updateDate;
    private String insertUser;
    private String updateUser;
    */

    public DomainObject(Date insertDate) {
        this.insertDate = insertDate;
    }

    public DomainObject() {
    }

    @Column
    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
