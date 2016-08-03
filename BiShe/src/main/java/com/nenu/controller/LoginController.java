package com.nenu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.nenu.pojo.Group;
import com.nenu.pojo.User;
import com.nenu.service.ILoginService;
import com.nenu.service.impl.LoginServiceImpl;

@Controller
@SessionAttributes("loginuser")
public class LoginController {

	private String successView;
	private String failView;

	public String getSuccessView() {
		return successView;
	}

	public void setSuccessView(String successView) {
		this.successView = successView;
	}

	public String getFailView() {
		return failView;
	}

	public void setFailView(String failView) {
		this.failView = failView;
	}

	private ILoginService loginService;

	public ILoginService getLoginService() {
		return loginService;
	}

	@Resource
	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(User user, HttpServletRequest rsq) throws Exception {

		List<Group> group = new ArrayList<Group>();
		user = loginService.checkLogin(user.getUsername(), user.getPassword());
		Map<String, Object> model = new HashMap<String, Object>();
		if (user != null) {
			model.put("loginuser", user);
			rsq.getSession(true).setAttribute("user", user);
			group =  loginService.getUserGroup(user.getUserid());
			System.out.println(user);
			System.out.println(group);
			rsq.setAttribute("group", group);
			return new ModelAndView(getSuccessView(), model);
		} else {
			model.put("error", "用户名或密码输入错误!");
			return new ModelAndView(getFailView(), model);
		}
	}
}