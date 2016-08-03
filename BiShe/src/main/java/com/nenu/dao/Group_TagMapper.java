package com.nenu.dao;

import com.nenu.pojo.Group_Tag;

public interface Group_TagMapper {
    int deleteByPrimaryKey(Integer gTId);

    int insert(Group_Tag record);

    int insertSelective(Group_Tag record);

    Group_Tag selectByPrimaryKey(Integer gTId);

    int updateByPrimaryKeySelective(Group_Tag record);

    int updateByPrimaryKey(Group_Tag record);
}