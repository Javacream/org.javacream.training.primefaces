package org.javacream.books.isbngenerator.web.frontend;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component("isbnGeneratorWebBean")
@RequestScope
public class IsbnGeneratorWebBean {


	private String generatedIsbn;

	public String getGeneratedIsbn() {
		return generatedIsbn;
	}

	public String next() {

		generatedIsbn = "ISBN: " + System.currentTimeMillis();
		return null;
	}
}
