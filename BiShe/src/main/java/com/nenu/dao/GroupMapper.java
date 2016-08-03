package com.nenu.dao;

import java.util.List;

import com.nenu.pojo.Group;
import com.nenu.pojo.User;
import com.nenu.pojo.User_Group;

public interface GroupMapper {
    int deleteByPrimaryKey(Integer groupid);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(Integer groupid);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
    
    Group selectByGroupname(String groupname);  
    
    int updateUsernum(Integer groupid);
    
    List<Group> getUserGroup(Integer userid);
}