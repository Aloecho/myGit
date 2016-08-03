package com.nenu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nenu.dao.GroupMapper;
import com.nenu.dao.UserMapper;
import com.nenu.dao.User_GroupMapper;
import com.nenu.pojo.Group;
import com.nenu.pojo.User;
import com.nenu.pojo.User_Group;
import com.nenu.service.IRegisterService;

@Service("registerService")
public class RegisterServiceImpl implements IRegisterService {

	@Resource
	private UserMapper userMapper;
	@Resource
	private User_GroupMapper u_gMapper;
	@Resource
	private GroupMapper groupMapper;

	@Override
	public User selectByUsername(String username) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByUsername(username);
	}
	
	@Override
	public User selectByEmail(String email) {
		// TODO Auto-generated method stub
		return userMapper.selectByEmail(email);
	}
	
	@Override
	public Group selectByGroupname(String groupname) {
		// TODO Auto-generated method stub
		return this.groupMapper.selectByGroupname(groupname);
	}

	@Override
	public Group selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		return groupMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		User user1 = selectByUsername(user.getUsername());
		User user2 = selectByEmail(user.getEmail());
		if(user1 != null) {
			return 0;
		} else if(user2 !=null) {
			return -1;
		} else {
			return this.userMapper.insert(user);
		}
	}

	@Override
	public int insert_u_g(User user, Group group) {
		// TODO Auto-generated method stub
		User_Group user_group = new User_Group();
		user_group.setUserid(user.getUserid());
		user_group.setGroupid(group.getGroupid());
		return this.u_gMapper.insert(user_group);
	}
	
	@Override
	public int updateUsernum(int id) {
		// TODO Auto-generated method stub
		return groupMapper.updateUsernum(id);
	}

	
}
