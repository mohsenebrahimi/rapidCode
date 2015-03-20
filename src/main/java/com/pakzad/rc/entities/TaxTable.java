package com.pakzad.rc.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/16/2015.
 */
@Entity
@Table(name = "TAX_TABLE")
public class TaxTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private Date effectiveDate;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
