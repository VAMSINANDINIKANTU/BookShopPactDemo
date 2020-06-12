package com.bookshopapp.service;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshopapp.entities.Book;

@Service
public class BookConsumerService {
	@Autowired
	ProviderConnector providerConnector;
   
	public BookConsumerService(ProviderConnector providerConnector) {
		super();
		this.providerConnector = providerConnector;
	}
	public Optional<Book> getBook(Long id) {
		Optional<Book> BookHolder = Optional.empty();
		try {
			BookHolder = Optional.ofNullable(providerConnector
					.serializeData(providerConnector.getData(String.format("/book/%d", id)).getBody(), Book.class));
		} catch (Exception e) {
			e.printStackTrace();
			return BookHolder;
		}
		return BookHolder;
	}
    public Optional<Book> getBook(String bookName) {
		Optional<Book> BookHolder = Optional.empty();
		try {
			BookHolder = Optional.ofNullable(providerConnector
					.serializeData(providerConnector.getData(String.format("/bookName/%s", bookName)).getBody(), Book.class));
		} catch (Exception e) {
			e.printStackTrace();
			return BookHolder;
		}
		return BookHolder;
	}
    
    }

