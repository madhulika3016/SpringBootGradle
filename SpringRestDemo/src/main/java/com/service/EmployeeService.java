package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advices.ResourceNotFoundException;
import com.model.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	List<Employee> le;
	
	@Autowired(required=true)
	EmployeeRepository erepo;
	
	public List<Employee> getEmps()
	{
		le=new ArrayList<>();
		le=erepo.findAll();
		return le;
	}
	
	public Employee getEmpById(int eid)
	{
		String tech="JAVA";
		Employee e1=erepo.findById(eid).orElse(null);
		List<Employee> e2=erepo.findByTech(tech);
		List<Employee> e3=erepo.findByTechSorted(tech);
		System.out.println(e2);
		System.out.println(e3);
		return e1;
	}
	
	public Employee createEmp(Employee e)
	{
		Employee e1=erepo.save(e);
		return e1;
	}

	public List<Employee> addEmps(List<Employee> ls) {
		le=new ArrayList<>();
		le=erepo.saveAll(ls);
		return le;
	}

	public Employee updateEmp(Employee e) throws Exception  {
		int id=e.getEid();
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Employee id is not present in the database");
		Employee e1=erepo.findById(id).orElseThrow(s1);
		
		e1.setEname(e.getEname());
			e1.setTech(e.getTech());
			erepo.save(e1);
			return e1;	
	}

	public String deleteEmp(Employee e) {
		erepo.delete(e);
		return "Deleted";
	}

	public String deleteEmpById(int eid) {
		Employee e=erepo.findById(eid).orElse(null);
		erepo.deleteById(eid);
		return "Deleted";
	}

}
