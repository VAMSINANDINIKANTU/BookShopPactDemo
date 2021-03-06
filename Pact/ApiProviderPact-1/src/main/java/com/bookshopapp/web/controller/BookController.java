package com.bookshopapp.web.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bookshopapp.exceptionhandler.BookNotFoundException;
import com.bookshopapp.model.entities.Book;
import com.bookshopapp.model.service.BookService;

@RestController
@RequestMapping(path = "/api")
public class BookController {
        private BookService bookService;
        @Autowired
	public BookController(BookService bookService) {
    	this.bookService = bookService;
	}

	@GetMapping(path = "/book", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>> getAllBooks() {
		return new ResponseEntity<List<Book>>(bookService.getAllBooks(), HttpStatus.OK);
	}

	@GetMapping(path = "/book/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> getAnBook(@PathVariable(name = "id") Long id) {
		Book book = bookService.findBookById(id).orElseThrow(BookNotFoundException::new);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
        }

	@GetMapping(path = "/bookName/{bookName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> getAnBook(@PathVariable(name = "bookName") String bookName) {
		Book book = bookService.findBybookName(bookName).orElseThrow(BookNotFoundException::new);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}

	@DeleteMapping(path = "/book/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteAnBook(@PathVariable(name = "id") Long id) {
		bookService.deleteBook(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping(path="book/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<Book>addAnBook(@PathVariable(name="id")Long id, @RequestBody Book book){
                return new ResponseEntity<Book>(bookService.addBook(book),HttpStatus.CREATED);
        }

	@PutMapping(path = "book/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> updateAnBook(@PathVariable(name = "id") Long id, @RequestBody Book book) {
		return new ResponseEntity<Book>(bookService.updateBook(id, book), HttpStatus.OK);
	}
}
