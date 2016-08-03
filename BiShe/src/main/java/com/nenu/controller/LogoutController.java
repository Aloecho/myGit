package com.nenu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nenu.pojo.User;

@Controller
public class LogoutController {

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView loginout(HttpSession session) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		model.remove("loginuser");
		session.invalidate();
		return new ModelAndView("/Login");
	}
}
