package com.nenu.dao;

import com.nenu.pojo.User_Group;

public interface User_GroupMapper {
    int deleteByPrimaryKey(Integer uGId);

    int insert(User_Group record);

    int insertSelective(User_Group record);

    User_Group selectByPrimaryKey(Integer uGId);

    int updateByPrimaryKeySelective(User_Group record);

    int updateByPrimaryKey(User_Group record);
    
}