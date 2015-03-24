package com.pakzad.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 2/28/2015.
 */
@Entity
@Table(name = "TAX_ADMINISTRATION")
public class TaxAdministration  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String title;
    @Column
    private String unit;
    @Column
    private String address;
    @Column
    private String tel;
    @Column
    private Date date;
    @ManyToOne
    private Town town;

    public TaxAdministration(String code, String title, String unit, String address, String tel, Date date, Town town) {
        this.code = code;
        this.title = title;
        this.unit = unit;
        this.address = address;
        this.tel = tel;
        this.date = date;
        this.town = town;
    }


    public TaxAdministration() {
        super();
    }


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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }
}
