package com.hdd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model,HttpServletRequest req,HttpServletResponse resp) {
		model.addAttribute("test","sdfsd");
		return "home";
	}

}
