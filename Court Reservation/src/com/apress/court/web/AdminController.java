package com.apress.court.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	public ModelAndView welcomPage()
	{
		ModelAndView model = new ModelAndView();
		return model;
	}

}
