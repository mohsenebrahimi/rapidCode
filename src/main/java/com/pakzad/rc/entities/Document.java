package com.pakzad.rc.entities;

import javax.persistence.*;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/16/2015.
 */
@Entity
@Table(name = "DOCUMENT")
public class Document  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
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


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }



}
