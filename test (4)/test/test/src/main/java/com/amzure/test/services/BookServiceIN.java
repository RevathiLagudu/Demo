package com.amzure.test.services;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amzure.test.dto.requst.BookRequest;
import com.amzure.test.dto.response.BookResponse;
import com.amzure.test.entities.BookEntity;
import com.amzure.test.repositories.BookRepository;

@Service
public class BookServiceIN implements BookService {
	@Autowired
	private BookRepository bookRepository;

	public BookResponse save(BookRequest bookRequest) {
		BookEntity bookEntity = new BookEntity();
		// BookEntity.setPrice(bookRequest.getPrice());
		// BookEntity.setTitle(bookRequest.getTitle());
		BeanUtils.copyProperties(bookRequest, bookEntity);
		bookEntity = bookRepository.save(bookEntity);

		BookResponse bookResponse = new BookResponse();
		BeanUtils.copyProperties(bookEntity, bookResponse);
		return bookResponse;
	}

	public List<BookResponse> findAll() {
		return bookRepository.findAll().stream().map(this::convertEntityToResponse).collect(Collectors.toList());
	}

	public BookResponse findById(Long id) {
		BookEntity bookEntity = bookRepository.findById(id).get();
		return convertEntityToResponse(bookEntity);
	}

	public List<BookResponse> findByTitle(String title) {
		return bookRepository.findByTitle(title).stream().map(this::convertEntityToResponse).collect(Collectors.toList());
	}

	public List<BookResponse> findByPublishedDateAfter(LocalDate date) {
		return bookRepository.findByPublishedDateAfter(date).stream().map(this::convertEntityToResponse).collect(Collectors.toList());
	}
	
		
	public BookResponse convertEntityToResponse(BookEntity bookEntity) {
		BookResponse bookResponse = new BookResponse();
		BeanUtils.copyProperties(bookEntity, bookResponse);
		bookResponse.setCashBack(20);
		return bookResponse;
		
	}

}
