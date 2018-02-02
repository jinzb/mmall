package com.mmall.dao;

import com.mmall.pojo.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer catgcode);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer catgcode);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

}