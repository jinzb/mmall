package com.mmall.dao;

import com.mmall.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer usrcode);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer usrcode);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}