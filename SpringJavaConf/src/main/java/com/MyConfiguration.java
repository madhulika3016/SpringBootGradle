package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com")
public class MyConfiguration {
	
	/*
	 * @Bean 
	 * public Employee employee() 
	 * { Employee employee=new Employee();
	 * employee.setEid(102); 
	 * employee.setEname("Tarun"); 
	 * return employee;
	 * 
	 * }
	 */
	
	@Bean
	public Author author()
	{	
		Author author=new Author("Kanetkar","Nagpur");
		return author;
		}
	@Bean(initMethod="setUp",destroyMethod="cleanUp")
	@Scope("prototype")
	public Book book()
	{
		Book book=new Book();
		book.setYear("1995");
		book.setIsbn("Kj77756");
		book.setAuthor(author());
		return book;

	}

}
