package com.mmall.dao;

import com.mmall.pojo.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cartcode);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartcode);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}