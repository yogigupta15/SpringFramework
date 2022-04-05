package com.training.jpademo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
    @GeneratedValue
    private Long id;
    private String name;
    private int level;

    public Employee(){

    }
    public Employee(String name, int level){
        this.name = name;
        this.level = level;
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

    public String toString(){
        return "Employee (" + getId() +", " + getName() +", " + getLevel() + ")";
    }

}
