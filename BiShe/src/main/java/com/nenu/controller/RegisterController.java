package com.nenu.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.print.attribute.standard.PrinterLocation;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nenu.pojo.Group;
import com.nenu.pojo.User;
import com.nenu.service.IRegisterService;

@Controller
public class RegisterController {

	@Resource
	private IRegisterService registerService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest rsq) throws Exception {
		int flag;
		Map<String, Object> model = new HashMap<String, Object>();
		User user = new User();
		user.setUsername(rsq.getParameter("username"));
		user.setPassword(rsq.getParameter("password"));
		user.setSchoolname(rsq.getParameter("schoolname"));
		user.setEmail(rsq.getParameter("email"));
		flag = registerService.insert(user);
		User user1 = registerService.selectByUsername(user.getUsername());// 需要从数据库中获取userid
		User user2 = registerService.selectByEmail(user.getEmail());
		if (flag == 0) {
			model.put("error", "该用户名已存在！");
			return new ModelAndView("/Register", model);
		} else if(flag == -1) {
			model.put("error", "该邮箱已被注册！");
			return new ModelAndView("/Register", model);
		} else {
			Group group = registerService.selectByGroupname(user.getSchoolname());
			registerService.updateUsernum(group.getGroupid());
			registerService.insert_u_g(user1, group);
			model.put("user", user1);
			return new ModelAndView("/WEB-INF/view/HomePage", model);
		}
	}
}
