package com.nenu.service;

import com.nenu.pojo.Group;
import com.nenu.pojo.User;

public interface IRegisterService {
	public int insert(User user);
	
	public int insert_u_g(User user, Group group);
	
	public User selectByUsername(String username);
	
	public Group selectByGroupname(String groupname);

	public Group selectByPrimaryKey(int id);

	public int updateUsernum(int id);
	
	public User selectByEmail(String email);
}
