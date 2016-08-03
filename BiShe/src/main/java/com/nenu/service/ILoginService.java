package com.nenu.service;

import java.util.List;

import com.nenu.pojo.Group;
import com.nenu.pojo.User;

public interface ILoginService {
	public User selectByUsername(String username);
	
	public  User checkLogin(String username, String password);
	
	public User selectByPrimaryKey(int id);
	
	public List<Group> getUserGroup(int id);
}
