package com.training.jpademo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="Employee")
public class Employee{
	@Id
    @GeneratedValue
    private Long id;
    private String name;
    private int level;
    private Date birthDate;
    
    @Column(unique =true)
    private String email;
    
    public Employee(){

    }
    public Employee(String name, int level, String email, Date birthDate){
        this.name = name;
        this.level = level;
        this.email = email;
        this.birthDate=birthDate;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getLevel(){
        return level;
    }

    public void setLevel(Integer level){
        this.level =level;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
   
    public Date getBirthDate() {
    	return birthDate;
    }
    
    public void setBirthDate(Date birthDate) {
    	this.birthDate = birthDate;
    }

    public String toString(){
        return "Employee (" + getId() +", " + getName() +", " + getLevel() + ", "+ getEmail() + ", "+ getBirthDate() + ")";
    }
	public Employee get() {
		Employee Employee = null;
		// TODO Auto-generated method stub
		return Employee;
	}
	
	
}