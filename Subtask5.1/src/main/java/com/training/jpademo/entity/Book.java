package com.training.jpademo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Book")
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String author;
	private int rating;
	private boolean available;
	
	public Book() {	
		
	}
	
	public Book(String title, String author, int rating, boolean available) {
		this.title = title;
		this.author = author;
		this.rating = rating;
		this.available= available;
	}
	public Long getId(){
        return id;
    }
	public void setId(Long id ){
        this.id = id ;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
    	this.title = title;
    }
    public String getAuthor(String author) {
    	return author;
    }
    public void setAuthor(String author) {
    	this.author = author;
    }
    public int getRating(int rating) {
    	return rating;
    }
    public void setRating(int rating) {
    	this.rating = rating;
    }
	public boolean getAvailable(boolean available) {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public String toString() {
		return "Book (" + getId() +", " + getTitle() +", " + getAuthor(author) + ", "+ getRating(rating) + ", "+ getAvailable(available) + ")";
	}
}
