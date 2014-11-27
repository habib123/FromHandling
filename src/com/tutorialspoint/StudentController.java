package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.yogee.application.UserDomainObject;

@Controller
public class StudentController {

   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("student", "command", new Student());
   }

   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   @ExceptionHandler({SpringException.class})
   public ModelAndView addStudent( @ModelAttribute Student student) {
	

      if(student.getName().length() < 5 ){
         throw new SpringException("Given name is too short");
      }
      if( student.getAge() < 10 ){
         throw new SpringException("Given age is too low");
      }
     
  	ModelAndView model = new ModelAndView( "result","student1",student);	
	return model;
   }
   
   
	@ModelAttribute("student")	
	public Student inputFormBackingObject33(){
		return new Student();
	}
   
}