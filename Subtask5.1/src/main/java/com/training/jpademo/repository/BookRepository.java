package com.training.jpademo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.training.jpademo.entity.Book;


@Transactional
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
	@Query("From Book b WHERE b.available = true")
	List<Book> findAvailableBook();
	
	@Query("Select b FROM Book b WHERE b.author = ?1")
	List<Book> findByAuthor(String author);
	
	@Query("Select b FROM Book b Where b.author =:author AND b.available = :avail ORDER BY title")
	List<Book> findByAuthorAndAvailability(@Param("author")String author,
			                              @Param ("avail")boolean available);
	
	@Modifying
	@Query("UPDATE Book b SET b.title = ?1 WHERE b.id = ?2")
	int updateTitleById(String title, Long id);
	
	@Modifying
	@Query("DELETE FROM Book b WHERE b.title = ?1")
	void deleteByTitle(String title);
	
	List<Book> findAllNameQuery();
	
	List<Book> findByTitleNameQuery(String title);
	
	@Query(nativeQuery = true)
	List<Book> findByAuthorNativeNameQuery(@Param("author")String author);

}
