package com.mmall.pojo;

import java.util.Date;

public class Cart {
    private Integer cartcode;

    private Integer usrcode;

    private Integer procode;

    private Integer quantity;

    private Integer checked;

    private Date cretime;

    private Date updtime;

    public Cart(Integer cartcode, Integer usrcode, Integer procode, Integer quantity, Integer checked, Date cretime, Date updtime) {
        this.cartcode = cartcode;
        this.usrcode = usrcode;
        this.procode = procode;
        this.quantity = quantity;
        this.checked = checked;
        this.cretime = cretime;
        this.updtime = updtime;
    }

    public Cart() {
        super();
    }

    public Integer getCartcode() {
        return cartcode;
    }

    public void setCartcode(Integer cartcode) {
        this.cartcode = cartcode;
    }

    public Integer getUsrcode() {
        return usrcode;
    }

    public void setUsrcode(Integer usrcode) {
        this.usrcode = usrcode;
    }

    public Integer getProcode() {
        return procode;
    }

    public void setProcode(Integer procode) {
        this.procode = procode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
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