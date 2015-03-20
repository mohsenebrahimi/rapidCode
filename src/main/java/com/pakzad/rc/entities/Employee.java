package com.pakzad.rc.entities;

import javax.persistence.*;

/**
 * @author ramin pakzad (ramin.highborn@gmail.com) on 3/16/2015.
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String title;
    @Column
    private String post;
    @Column
    private String tel;
    @Column
    private String mobile;


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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Employee() {
    }
}
