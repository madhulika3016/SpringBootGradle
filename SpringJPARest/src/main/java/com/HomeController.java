package com;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/api")
public class HomeController {
	
	@Autowired
	EmployeeRepo repo;
	
		@RequestMapping(value="/home")
		@ResponseBody
		public String home()
		{
			System.out.println("Welcome to Spring Rest");
		
			return "Welcome to Spring Rest";
		}
		@RequestMapping(value="/register")
		@ResponseBody
		public String register()
		{
			System.out.println("User Registered Successfully");
		
			return "User Registered Successfully";
		}
		@RequestMapping(value="/login")
		@ResponseBody
		public String login()
		{
			System.out.println("Welcome to Home Page");
		
			return "Welcome to Home Page";
		}
		
		
		  @GetMapping(path="/GetE", produces = {"application/json"})
		  @ResponseBody 
		  public List<Employee> getEmployees() 
		  { 
			  List<Employee> le=repo.findAll(); 
			 System.out.println(repo.findByTech("Python"));
			 System.out.println(repo.findByTechSorted("ML"));
			  return le; 
			  }
		  
		  @GetMapping("/GetE/{eid}")
		  @ResponseBody 
		  public Optional<Employee> getEmployee(@PathVariable Integer eid) 
		  { 
			  Optional<Employee> e1=repo.findById(eid); 
		  return e1; 
		  }
		 
		
		@PostMapping("/addE")
		public Employee addEmployee(@RequestBody  Employee e)
		{
			repo.save(e);
			return e;	
		}
		
		@PostMapping(path="/addEmployees", consumes = {"application/json"})
		public List<Employee> addEmployee(@RequestBody  List<Employee> le)
		{
			repo.saveAll(le);
			return le;	
		}
		
		@DeleteMapping("/removeE")
		public String deleteEmployee(@RequestBody Employee e1)
		{
			repo.delete(e1);
			return "Deleted";
		}
		
		@DeleteMapping("/remove/{eid}")
		public String deleteEmployee(@PathVariable Integer eid)
		{
			Employee e1=repo.getOne(eid);
			repo.delete(e1);
			//repo.deleteById(eid);
			return "Deleted";
		}
		
		@PutMapping("/updateE")
		public Employee updateEmployee(@RequestBody Employee e) throws Throwable
		{
			Supplier<Exception> s1 = ()->new ResourceNotFoundException();
			int id=e.getEid();
			Employee e1=repo.findById(id).orElseThrow(s1);
			 
		e1.setEname(e.getEname());
			e1.setTech(e.getTech());
			repo.save(e1);
			return e1;	
		}
		
}
