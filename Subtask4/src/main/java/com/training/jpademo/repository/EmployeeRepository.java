package com.training.jpademo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.jpademo.entity.Employee;

public interface EmployeeRepository extends JpaRepository <Employee,Long>{

	List<Employee> findByName(String name);
	Employee findById(long id);
	Employee findByEmail(String email);
	
	List<Employee> findByNameOrEmail(String name, String email);
	List<Employee> findByNameAndLevel(String name, int level);
	
	List<Employee> findByNameIs(String name);
	List<Employee> findByNameEquals(String name);
	
	List<Employee> findByNameIsNot(String name);
	
	List<Employee> findByNameStartsWith(String perfix);
	List<Employee> findByNameEndsWith(String suffix);
	List<Employee> findByNameIgnoreCase(String name);
	List<Employee> findByNameLike(String pattern);
	List<Employee> findFirstByName(String name);
	List<Employee> findFirstByNameOrderByLevelAsc(String name);
	
	List<Employee> findByEmailContaining(String infix);
	
	Employee findFirstByOrderByEmail();
	List<Employee> findByLevelLessThan(int level);
	List<Employee> findByLevelLessThanEqual(int level);
	
	List<Employee> findByLevelGreaterThan(int level);
	List<Employee> findFirst2ByLevelOrderByBirthDateDesc (int level);
	
	List<Employee> findByBirthDateBefore(Date before);
	List<Employee> findByBirthDateAfter(Date after);
	List<Employee> findByBirthDateBetween(Date start, Date end);
	
	Employee findTopByOrderByBirthDateDesc();
}
