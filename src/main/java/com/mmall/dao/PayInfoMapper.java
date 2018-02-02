package com.mmall.dao;

import com.mmall.pojo.PayInfo;

public interface PayInfoMapper {
    int deleteByPrimaryKey(Integer paycode);

    int insert(PayInfo record);

    int insertSelective(PayInfo record);

    PayInfo selectByPrimaryKey(Integer paycode);

    int updateByPrimaryKeySelective(PayInfo record);

    int updateByPrimaryKey(PayInfo record);
}