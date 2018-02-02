package com.mmall.dao;

import com.mmall.pojo.OrderItem;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer ordercode);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer ordercode);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}