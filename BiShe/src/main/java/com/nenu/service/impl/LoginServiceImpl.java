package com.nenu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nenu.dao.GroupMapper;
import com.nenu.dao.UserMapper;
import com.nenu.pojo.Group;
import com.nenu.pojo.User;
import com.nenu.service.ILoginService;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

	@Resource
	private UserMapper userMapper;
	@Resource
	private GroupMapper groupMapper;

	@Override
	public User selectByUsername(String username) {
		return this.userMapper.selectByUsername(username);
	}

	public User checkLogin(String username, String password) {
		User user = selectByUsername(username);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		} 
		return null;
	}

	@Override
	public User selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public List<Group> getUserGroup(int id) {
		// TODO Auto-generated method stub
		return groupMapper.getUserGroup(id);
	}
}
