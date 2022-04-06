package com.training.jpademo.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.jpademo.entity.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootTest
public class EmployeeRepositoryTest {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	private char[] employee;
	
	@Test
    public void saveEmployee() throws ParseException{
		
		employeeRepository.save(new Employee("Richard",2,"richard@gmail.com",new SimpleDateFormat("dd/mm/yyyy").parse("12/12/1994")));
		employeeRepository.save(new Employee("Shri",1,"shri@gmail.com",new SimpleDateFormat("dd/mm/yyyy").parse("15/02/1996")));
		employeeRepository.save(new Employee("Hari",3,"hari@gmail.com",new SimpleDateFormat("dd/mm/yyyy").parse("06/04/1992")));
		employeeRepository.save(new Employee("Mahi",1,"mahi@gmail.com",new SimpleDateFormat("dd/mm/yyyy").parse("25/11/1990")));
		employeeRepository.save(new Employee("Rishi",2,"rishi@gmail.com",new SimpleDateFormat("dd/mm/yyyy").parse("09/10/1995")));
        
	}
	@Test
	public void findByNameEmloyee() {
			
		System.out.println("\nRetriving Employee by name");
		
		System.out.println("\nfindByName");
		List<Employee> empsByName =employeeRepository.findByName("Richard");
		System.out.println(empsByName.toString());
	}
	@Test
	public void findByIdEmployee() {
		employeeRepository.findById(4);
		System.out.println(employeeRepository.findById(4l));
	}
	@Test
	public void findByEmailEmployee() {
		Optional<Employee> emp = Optional.of(employeeRepository.findByEmail("mahi@gmail.com"));
		
		if(emp.isPresent()) {
			Employee employee = emp.get();
			employee.setEmail("mahi123@gmail.com");
			employeeRepository.save(employee);
		}
		System.out.println(employee);
	}
	@Test
	public void deleteEmployee() {
//	    employeeRepository.findByEmail("rishi@gmail.com").get();
//	    employeeRepository.delete(employeeRepository.findByEmail("rishi@gmail.com").get());
	
		employeeRepository.deleteAll();
	}	
	
	@Test
	public void findByNameOrEmailEmployee() {
		
		List<Employee> empsByNameOrEmail = ((EmployeeRepository) employeeRepository).findByNameOrEmail("Hari", "hari@gmail.com");
		System.out.println(empsByNameOrEmail.toString());
		
		System.out.println("\nOnly name matches");
		empsByNameOrEmail = ((EmployeeRepository) employeeRepository).findByNameOrEmail("Hari","hari123@gmail.com");
		System.out.println(empsByNameOrEmail.toString());
		
		System.out.println("\nOnly email matches");
		empsByNameOrEmail = ((EmployeeRepository) employeeRepository).findByNameOrEmail("Haris","hari@gmail.com");
		System.out.println(empsByNameOrEmail.toString());
		
	    System.out.println("\nNeither name nor email match");
	    empsByNameOrEmail = ((EmployeeRepository) employeeRepository).findByNameOrEmail("Haris","hari123@gmail.com");
		System.out.println(empsByNameOrEmail.toString());
		
		System.out.println("\nName and Email match diffrent people");
		empsByNameOrEmail = ((EmployeeRepository) employeeRepository).findByNameOrEmail("Hari","hari5434@gail.com");
		System.out.println(empsByNameOrEmail.toString());
	}
	
	@Test
	public void findByNameAndLevelEmployee() {
		System.out.println("\nName and Level match 1  employee");
		List<Employee>empsByNameAndLevel = employeeRepository.findByNameAndLevel("Shri", 1);
	    System.out.println(empsByNameAndLevel.toString());
	    
	    System.out.println("\nName and Level match 0 employee");
	    empsByNameAndLevel = employeeRepository.findByNameAndLevel("Shri",5);
	    System.out.println(empsByNameAndLevel.toString());
	}
	
	@Test
	public void findByNameISEmployee() {
		
		System.out.println("\nfindByNameIs");
		List<Employee> empsByName = employeeRepository.findByNameIs("Richard");
		System.out.println(empsByName.toString());
	}
	
	@Test
	public void findByNameEqualsEmployee() {
		
		System.out.println("\nfindByNameEquals");
		List<Employee>empsByName = employeeRepository.findByNameEquals("Richard");
		System.out.println(empsByName.toString());
	}
	@Test
	public void findByNameIsNotEmployee() {
		
		System.out.println("\nfindByNameIsNot");
		List<Employee> empsByName = employeeRepository.findByNameIsNot("Richard");
		System.out.println(empsByName.toString());
	}
	@Test
	public void findByNameStartsWith() {
		
		System.out.println("\nfindByNameStartsWith");
		List<Employee> empsByName = employeeRepository.findByNameStartsWith("H");
		System.out.println(empsByName.toString());
	}
	@Test
	public void findByNameEndsWith() {
		
		System.out.println("\nfindByNameEndsWith");
		List<Employee> empsByName = employeeRepository.findByNameEndsWith("a");
		System.out.println(empsByName.toString());		
	}
	@Test
	public void findByNameIgnoreCase() {
		
		System.out.println("\nfindByNameIgnoreCase");
		List<Employee> empsByName = employeeRepository.findByNameIgnoreCase("rICHARd");
		System.out.println(empsByName.toString());		
	}
	@Test
	public void findByNameLike() {
		
		System.out.println("\nfindByNameLike");
		List<Employee> empsByName = employeeRepository.findByNameLike("%a%");
		System.out.println(empsByName.toString());		
	}
	@Test
	public void findFirstByName() {
		
		System.out.println("\nfindFirstByName");
		List<Employee> empsByName = employeeRepository.findFirstByName("Hari");
		System.out.println(empsByName.toString());		
	}
	@Test
	public void findFirstByNameOrderByLevelAsc() {
		
		System.out.println("\nfindFirstByNameOrderByLevelAsc");
		List<Employee> empsByName = employeeRepository.findFirstByNameOrderByLevelAsc("Hari");
		System.out.println(empsByName.toString());		
	}
	@Test
	public void findByEmailContaining() {
		
		System.out.println("\nfindByEmailContaining");
		List<Employee> empsByEmail = employeeRepository.findByEmailContaining("rd");
		System.out.println(empsByEmail.toString());
	}
	@Test
	public void findByLevelLessThan() {
		
		System.out.println("\nfindByLevelLessThan");
		List<Employee> emps = employeeRepository.findByLevelLessThan(3);
		System.out.println(emps.toString());
	}
	@Test
	public void findByLevelLessThanEqual() {
		
		System.out.println("\nfindByLevelLessThan");
		List<Employee> emps = employeeRepository.findByLevelLessThan(3);
		System.out.println(emps.toString());	
	}
	@Test
	public void findByLevelGreaterThanEqual() {
		
		System.out.println("\nfindByLevelGreaterThanEqual");
		List<Employee> emps = employeeRepository.findByLevelGreaterThan(3);
		System.out.println(emps.toString());
	}
	@Test
	public void findFirst2ByLevelOrderByBirthDateDesc() {
		System.out.println("\nfindFirst2ByLevelOrderByBirthDateDesc");
		List<Employee> emps = employeeRepository.findFirst2ByLevelOrderByBirthDateDesc(3);
		System.out.println(emps.toString());
	}
	@Test
	public void findByBirthDateBefore() throws ParseException {
		
		Date refDate = new SimpleDateFormat("dd/MM/yyyy").parse("08/05/1994");
		System.out.println("\nfindByBirthDateBefore");
		List<Employee> emps = employeeRepository.findByBirthDateBefore(refDate);
		System.out.println(emps.toString());
	}
	@Test
	public void findByBirthDateAfter() throws ParseException {
		
		Date refDate = new SimpleDateFormat("dd/MM/yyyy").parse("08/05/1994");
		System.out.println("\nfindByBirthDateAfter");
		List<Employee> emps = employeeRepository.findByBirthDateAfter(refDate);
		System.out.println(emps.toString());
	}
	@Test
	public void findByBirthDateBetween() throws ParseException {
		
		Date refDate = new SimpleDateFormat("dd/MM/yyyy").parse("08/05/1994");
		Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/05/1994");
		System.out.println("\nfindByBirthDateBetween");
		List<Employee> emps = employeeRepository.findByBirthDateBetween(startDate,refDate);
		System.out.println(emps.toString());
	}
	@Test
	public void findTopByOrderByBirthDateDesc() {
		
		System.out.println("\nfindTopByOrderByBirthDateDesc");
		Employee emp = employeeRepository.findTopByOrderByBirthDateDesc();
		System.out.println(emp.toString());
	}
	
}
