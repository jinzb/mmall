package com.mmall.pojo;

import java.util.Date;

public class PayInfo {
    private Integer paycode;

    private Integer usrcode;

    private Long orderno;

    private Integer paytype;

    private String paynumb;

    private String paystatus;

    private Date cretime;

    private Date updtime;

    public PayInfo(Integer paycode, Integer usrcode, Long orderno, Integer paytype, String paynumb, String paystatus, Date cretime, Date updtime) {
        this.paycode = paycode;
        this.usrcode = usrcode;
        this.orderno = orderno;
        this.paytype = paytype;
        this.paynumb = paynumb;
        this.paystatus = paystatus;
        this.cretime = cretime;
        this.updtime = updtime;
    }

    public PayInfo() {
        super();
    }

    public Integer getPaycode() {
        return paycode;
    }

    public void setPaycode(Integer paycode) {
        this.paycode = paycode;
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

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getPaynumb() {
        return paynumb;
    }

    public void setPaynumb(String paynumb) {
        this.paynumb = paynumb == null ? null : paynumb.trim();
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus == null ? null : paystatus.trim();
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