package com.bookshopapp.controller;
import java.io.IOException;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bookshopapp.entities.Book;
import com.bookshopapp.service.BookConsumerService;

@RestController
public class BookConsumerController {
       @Autowired
       BookConsumerService bookConsumerService;
       @GetMapping("hii")
       public ResponseEntity<String> keepAlive() {
	        return ResponseEntity.ok("hii");
        }

	@GetMapping("book/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") Long id) {
		return bookConsumerService.getBook(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("bookName/{bookName}")
	public ResponseEntity<Book> getBook(@PathVariable("bookName") String bookName) {
		return bookConsumerService.getBook(bookName).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
}
