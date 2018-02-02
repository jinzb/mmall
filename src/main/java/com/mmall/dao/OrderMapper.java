package com.mmall.dao;

import com.mmall.pojo.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer ordercode);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer ordercode);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}