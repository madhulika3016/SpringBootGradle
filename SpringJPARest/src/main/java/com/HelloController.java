package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller    
	public class HelloController   
	{ 
	
	Logger logger=LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/")    
	public String index()  
	{ 
		logger.trace("this is trace level");
		logger.debug("This a debug level");
		logger.info("This is info level");
		logger.warn("This is warning level");
		logger.error("This is Error level");
	return"index";    
	}    
	@RequestMapping(value="/save", method=RequestMethod.POST)    
	public ModelAndView save(@ModelAttribute Employee e)  
	{    
	ModelAndView mv = new ModelAndView();    
	mv.setViewName("display");        
	mv.addObject("emp",e);      
	return mv;    
	}    

}
