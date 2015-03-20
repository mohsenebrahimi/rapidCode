package com.pakzad.rc.entities;


import javax.persistence.*;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/13/2015.
 */
@Entity
@Table(name = "CITY")
public class City  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String latinName;
    @Column
    private String title;


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


    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public City(Long id, String code, String englishName, String title) {
        this.id = id;
        this.code = code;
        this.latinName = englishName;
        this.title = title;
    }

    public City() {
    }

}
