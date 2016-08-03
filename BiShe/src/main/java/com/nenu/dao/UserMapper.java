package com.nenu.dao;

import com.nenu.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
    
    User selectByUsername(String username);
    
    User selectByEmail(String email);
}