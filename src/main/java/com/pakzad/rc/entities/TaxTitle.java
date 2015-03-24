package com.pakzad.entities;

import javax.persistence.*;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/16/2015.
 */
@Entity
@Table(name = "TAX_TITLE")
public class TaxTitle  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String title;
    @Column
    private String valueAddedTax;
    @Column
    private String taxesPerformance;



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

    public String getValueAddedTax() {
        return valueAddedTax;
    }

    public void setValueAddedTax(String valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }

    public String getTaxesPerformance() {
        return taxesPerformance;
    }

    public void setTaxesPerformance(String taxesPerformance) {
        this.taxesPerformance = taxesPerformance;
    }
}
