package com.mmall.pojo;

import java.util.Date;

public class Category {
    private Integer catgcode;

    private Integer ownercode;

    private String catgname;

    private Boolean status;

    private Integer ordernum;

    private Date cretime;

    private Date updtime;

    public Category(Integer catgcode, Integer ownercode, String catgname, Boolean status, Integer ordernum, Date cretime, Date updtime) {
        this.catgcode = catgcode;
        this.ownercode = ownercode;
        this.catgname = catgname;
        this.status = status;
        this.ordernum = ordernum;
        this.cretime = cretime;
        this.updtime = updtime;
    }

    public Category() {
        super();
    }

    public Integer getCatgcode() {
        return catgcode;
    }

    public void setCatgcode(Integer catgcode) {
        this.catgcode = catgcode;
    }

    public Integer getOwnercode() {
        return ownercode;
    }

    public void setOwnercode(Integer ownercode) {
        this.ownercode = ownercode;
    }

    public String getCatgname() {
        return catgname;
    }

    public void setCatgname(String catgname) {
        this.catgname = catgname == null ? null : catgname.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public Date getCretime() {
        return cretime;
    }

    public void setCretime(Date cretime) {
        this.cretime = cretime;
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }
}