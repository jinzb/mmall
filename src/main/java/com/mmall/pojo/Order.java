package com.mmall.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer ordercode;

    private Long orderno;

    private Integer usrcode;

    private Integer shipcode;

    private BigDecimal actpay;

    private Integer paytype;

    private Integer postage;

    private Integer status;

    private Date paytime;

    private Date sendtime;

    private Date endtime;

    private Date closetime;

    private Date cretime;

    private Date updtime;

    public Order(Integer ordercode, Long orderno, Integer usrcode, Integer shipcode, BigDecimal actpay, Integer paytype, Integer postage, Integer status, Date paytime, Date sendtime, Date endtime, Date closetime, Date cretime, Date updtime) {
        this.ordercode = ordercode;
        this.orderno = orderno;
        this.usrcode = usrcode;
        this.shipcode = shipcode;
        this.actpay = actpay;
        this.paytype = paytype;
        this.postage = postage;
        this.status = status;
        this.paytime = paytime;
        this.sendtime = sendtime;
        this.endtime = endtime;
        this.closetime = closetime;
        this.cretime = cretime;
        this.updtime = updtime;
    }

    public Order() {
        super();
    }

    public Integer getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(Integer ordercode) {
        this.ordercode = ordercode;
    }

    public Long getOrderno() {
        return orderno;
    }

    public void setOrderno(Long orderno) {
        this.orderno = orderno;
    }

    public Integer getUsrcode() {
        return usrcode;
    }

    public void setUsrcode(Integer usrcode) {
        this.usrcode = usrcode;
    }

    public Integer getShipcode() {
        return shipcode;
    }

    public void setShipcode(Integer shipcode) {
        this.shipcode = shipcode;
    }

    public BigDecimal getActpay() {
        return actpay;
    }

    public void setActpay(BigDecimal actpay) {
        this.actpay = actpay;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getPostage() {
        return postage;
    }

    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
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