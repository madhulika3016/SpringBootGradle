package com;


	import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

	import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
	
	@EnableWebMvc
	@ComponentScan(basePackages = "com")
	public class SpringConfig implements WebMvcConfigurer
	{	
		/*
		 * @Bean public ViewResolver viewResolver() {
		 * System.out.println("in spring config");
		 * 
		 * InternalResourceViewResolver viewResolver = new
		 * InternalResourceViewResolver(); viewResolver.setViewClass(JstlView.class);
		 * viewResolver.setPrefix("/WEB-INF/"); viewResolver.setSuffix(".jsp"); return
		 * viewResolver; }
		 */

	    @Override
	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }
	}



