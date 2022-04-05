package com.training.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.jpademo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
