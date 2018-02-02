package com.mmall.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Integer procode;

    private Integer catgcode;

    private String proname;

    private String subtitle;

    private String mainimg;

    private String detail;

    private BigDecimal price;

    private Integer stock;

    private Integer status;

    private Date cretime;

    private Date updtime;

    private String subimgs;

    public Product(Integer procode, Integer catgcode, String proname, String subtitle, String mainimg, String detail, BigDecimal price, Integer stock, Integer status, Date cretime, Date updtime, String subimgs) {
        this.procode = procode;
        this.catgcode = catgcode;
        this.proname = proname;
        this.subtitle = subtitle;
        this.mainimg = mainimg;
        this.detail = detail;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.cretime = cretime;
        this.updtime = updtime;
        this.subimgs = subimgs;
    }

    public Product() {
        super();
    }

    public Integer getProcode() {
        return procode;
    }

    public void setProcode(Integer procode) {
        this.procode = procode;
    }

    public Integer getCatgcode() {
        return catgcode;
    }

    public void setCatgcode(Integer catgcode) {
        this.catgcode = catgcode;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getMainimg() {
        return mainimg;
    }

    public void setMainimg(String mainimg) {
        this.mainimg = mainimg == null ? null : mainimg.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getSubimgs() {
        return subimgs;
    }

    public void setSubimgs(String subimgs) {
        this.subimgs = subimgs == null ? null : subimgs.trim();
    }
}