package org.javacream.books.warehouse.web.frontend;

import org.javacream.books.warehouse.api.Book;
import org.javacream.books.warehouse.api.BookException;
import org.javacream.books.warehouse.api.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class BooksServiceWebBean {
	private static final Book NOT_FOUND;
	static {
		NOT_FOUND = new Book();
		NOT_FOUND.setTitle("NOT_FOUND");
	}

	@Autowired
	private BooksService booksService;
	private String isbn;
	private Book book;

	public String search() {
		try {
			book = booksService.findBookByIsbn(isbn);
		} catch (BookException e) {
			System.out.println(e.getMessage());
			book = NOT_FOUND;
		}
		return null;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Book getBook() {
		return book;
	}
}
