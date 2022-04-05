package com.training.jpademo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.jpademo.entity.Employee;

@SpringBootTest
public class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	public void saveEmployee(){
		
		employeeRepository.save(new Employee("Richard",2));
        
	}
}
