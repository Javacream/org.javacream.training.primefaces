package org.javacream.webflow.example;

import java.io.Serializable;

import org.javacream.books.warehouse.BooksService;
import org.springframework.beans.factory.annotation.Autowired;

public class SimpleData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired private transient BooksService booksService;
	private String value = "Hello Webflow";

	public String getValue() {
		return value + ", booksService=" + booksService;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
