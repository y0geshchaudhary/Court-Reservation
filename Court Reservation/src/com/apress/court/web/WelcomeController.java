package com.apress.court.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
/*@RequestMapping("/welcome")*/
public class WelcomeController {
		
	
	
	@Value("#{ messageSource.getMessage('admin.email',null,'en')}")
	String mail;
	
	
		@RequestMapping(value="/welcome", method=RequestMethod.GET)
		public String welcome(Model model)
		{	
			model.addAttribute("mail",mail);
			Date date= new Date();
			model.addAttribute("today", date);
			return "welcome";
			
		}
	
}
