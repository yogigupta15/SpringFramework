package com.training.jpademo.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.training.jpademo.entity.Book;

@SpringBootTest
public class BookRepositoryTest {
	@Autowired
	private BookRepository bookRepository;
	@Test
	public void saveBook() {
		bookRepository.save(new Book("Anna Karenina","Leo Tolstoy",9,true));
		bookRepository.save(new Book("Pride and Prejudice","Jane Austen",8,false));
		bookRepository.save(new Book("The Marchant of Venice","Shakespare",8,true));
		bookRepository.save(new Book("A Tale of Two Cities","Charles Dickens",5,true));
		bookRepository.save(new Book("The Tunnel","William H. Gass",4,false));
	}
	@Test
	public void findAvailableBook() {
		
		System.out.println("\nQuerying for available books");
		List<Book> availableBook = bookRepository.findAvailableBook();
		System.out.println("\nOUTPUT:\n" + availableBook.toString());	
	}
	@Test
	public void findByAuthor() {
		
		System.out.println("\nQuerying for books authored by ");
		List<Book> books = bookRepository.findByAuthor("Shakespare");
		System.out.println("\nOUTPUT:\n" + books.toString());
	}
	@Test
	public void findByAuthorAndAvailability() {
		
		System.out.println("\nQuerying for books authored by Shakespare ");
		List<Book> books = bookRepository.findByAuthorAndAvailability("Shakespare",true);
		System.out.println("\nOUTPUT:\n" + books.toString());
	}
	@Test
	public void updateTitleById() {
		
		System.out.println("\nUpdating one of the books.. ");
		bookRepository.updateTitleById(" The Tempset", 9L);
		
	}
	@Test
	public void findAllNameQuery() {
		
		System.out.println("\nRetriving all books..");
		List<Book> books= bookRepository.findAllNameQuery();
		System.out.println("\nOUTPUT:\n" + books.toString());
		}
	@Test
	public void deleteByTitle() {
		
		System.out.println("Deleting one of the book..");
		bookRepository.deleteByTitle("The Tunnel");
	}
	@Test
	public void findByTitleNameQuery() {
		
		System.out.println("\nRetriving all books based on title..");
		List<Book> books= bookRepository.findByTitleNameQuery("Pride and Prejudice");
		System.out.println("\nOUTPUT:\n" + books.toString());
	}
	@Test
	public void findByAuthorNativeNameQuery() {
		
		System.out.println("\nRetriving all books based on author..");
		List<Book> books= bookRepository.findByAuthorNativeNameQuery("Leo Tolstoy");
		System.out.println("\nOUTPUT:\n" + books.toString());
	}
}
