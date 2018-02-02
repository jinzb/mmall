package com.mmall.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItem {
    private Integer ordercode;

    private Integer usrcode;

    private Long orderno;

    private Integer procode;

    private String proname;

    private String proimg;

    private BigDecimal currprice;

    private Integer quantity;

    private BigDecimal totalprice;

    private Date cretime;

    private Date updtime;

    public OrderItem(Integer ordercode, Integer usrcode, Long orderno, Integer procode, String proname, String proimg, BigDecimal currprice, Integer quantity, BigDecimal totalprice, Date cretime, Date updtime) {
        this.ordercode = ordercode;
        this.usrcode = usrcode;
        this.orderno = orderno;
        this.procode = procode;
        this.proname = proname;
        this.proimg = proimg;
        this.currprice = currprice;
        this.quantity = quantity;
        this.totalprice = totalprice;
        this.cretime = cretime;
        this.updtime = updtime;
    }

    public OrderItem() {
        super();
    }

    public Integer getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(Integer ordercode) {
        this.ordercode = ordercode;
    }

    public Integer getUsrcode() {
        return usrcode;
    }

    public void setUsrcode(Integer usrcode) {
        this.usrcode = usrcode;
    }

    public Long getOrderno() {
        return orderno;
    }

    public void setOrderno(Long orderno) {
        this.orderno = orderno;
    }

    public Integer getProcode() {
        return procode;
    }

    public void setProcode(Integer procode) {
        this.procode = procode;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getProimg() {
        return proimg;
    }

    public void setProimg(String proimg) {
        this.proimg = proimg == null ? null : proimg.trim();
    }

    public BigDecimal getCurrprice() {
        return currprice;
    }

    public void setCurrprice(BigDecimal currprice) {
        this.currprice = currprice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
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