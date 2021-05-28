package com;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

	List<Employee> findByTech(String tech);
	
	@Query("from Employee where tech=?1 order by ename")
	List<Employee>  findByTechSorted(String tech);
	
	
	
	

}
