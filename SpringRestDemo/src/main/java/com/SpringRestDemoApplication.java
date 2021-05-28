package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.model.Employee;
import com.model.Employee123;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@PropertySource("classpath:/emp.properties")
public class SpringRestDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(SpringRestDemoApplication.class, args);
		Employee123 e=(Employee123) context.getBean("emp");
		System.out.println(e);
		
	}
	
	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com")).build();
	   }
	
	//http://localhost:8080/swagger-ui/index.html

}
