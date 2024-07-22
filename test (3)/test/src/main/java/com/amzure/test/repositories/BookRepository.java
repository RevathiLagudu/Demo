package com.amzure.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.amzure.test.entities.BookEntity;

import java.time.LocalDate;
import java.util.List;

// Spring Data JPA creates CRUD implementation at runtime automatically.
@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
	 List<BookEntity> findByTitle(String title);
	 
	 // Custom query
	 @Query("SELECT b FROM BookEntity b WHERE b.pubDate > :date")
	 List<BookEntity> findByPublishedDateAfter(@Param("date") LocalDate date);
}