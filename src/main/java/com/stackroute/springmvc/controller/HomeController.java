package com.stackroute.springmvc.controller;

import com.stackroute.springmvc.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("login", new Login());
		return mav;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
									 @ModelAttribute("login") Login login) {
		Login loginObj=new Login(login.getUsername(),login.getPassword());
		ModelAndView mav = null;
		mav = new ModelAndView("welcome");
		mav.addObject("username", loginObj.getUsername());
		mav.addObject("password", loginObj.getPassword());
		return mav;
	}
}
