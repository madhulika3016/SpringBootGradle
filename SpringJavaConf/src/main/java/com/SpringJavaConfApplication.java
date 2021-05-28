package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SpringJavaConfApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringJavaConfApplication.class, args);
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		/*
		 * Employee e=(Employee) ctx.getBean("employee"); e.show();
		 */
		
		Book book1=(Book)ctx.getBean("book");
		System.out.println(" Book HashCode  : "+book1.hashCode());		
		System.out.println(" Book Info  : "+book1);	
		
		Book book2=(Book)ctx.getBean("book");
		System.out.println(" Book HashCode  : "+book2.hashCode());		
		System.out.println(" Book Info  : "+book2);
		
		Book book3=(Book)ctx.getBean("book");
		System.out.println(" Book HashCode  : "+book3.hashCode());		
		System.out.println(" Book Info  : "+book3);	
		try 
		{
			book1.cleanUp();
		} 		
		catch (Exception e1) {
			
			e1.printStackTrace();
		}
		ctx.close();
	}

}
