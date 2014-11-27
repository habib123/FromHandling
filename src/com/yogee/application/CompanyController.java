package com.yogee.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	
	@RequestMapping(value= {"/"})	
	public ModelAndView launchInputForm() {
		
		ModelAndView model = new ModelAndView( "inputForm");	
		return model;
		
	}
	@RequestMapping(value= {"/submitData"})		
	public ModelAndView getInputForm(@ModelAttribute UserDomainObject user) {
		ModelAndView model = new ModelAndView( "displayResults","user11",user);	
		return model;
		
	}
	
	@ModelAttribute("user11")	
	public UserDomainObject inputFormBackingObject33(){
		return new UserDomainObject();
	}

}
