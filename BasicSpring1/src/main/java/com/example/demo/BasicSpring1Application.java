package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@SpringBootApplication

public class BasicSpring1Application {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("studentbean.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		//Student s=(Student) factory.getBean("s1");
		
		Student s1=(Student) factory.getBean("student");
		
		s1.show();
		
		/*
		 * Student s2=(Student) factory.getBean("s2"); s2.show();
		 */
	}

}
