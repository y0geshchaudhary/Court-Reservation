package com.apress.validatorExample;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController 
{

	@RequestMapping(value="student")
	public ModelAndView getStudentForm()
	{
		ModelAndView model = new ModelAndView("student");
		model.addObject("student", new StudentDto());
		
		return model;
	}
	
	@RequestMapping(value="validate")
	public ModelAndView submitStudent(@Valid @RequestParam("student") StudentDto student, BindingResult result)
	{
		System.out.println("inside submitStudent method= "+ result.getErrorCount());
		
		System.out.println("student.getName()= "+student.getName());
		
		ModelAndView model;
		
		if(result.hasErrors())
		{
			model = new ModelAndView("student");
		}
		else
		{
			model= new ModelAndView("success");
			model.addObject("message","Valid Student");
		}
		
		return model;
	}
	
}
