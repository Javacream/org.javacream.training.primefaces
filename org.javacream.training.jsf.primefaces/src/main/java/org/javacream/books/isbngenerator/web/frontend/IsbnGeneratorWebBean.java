package org.javacream.books.isbngenerator.web.frontend;

import org.javacream.books.isbngenerator.api.IsbnGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component("isbnGeneratorWebBean")
@RequestScope
public class IsbnGeneratorWebBean {

	@Autowired
	private IsbnGenerator isbnGenerator;

	private String generatedIsbn;

	public String getGeneratedIsbn() {
		return generatedIsbn;
	}

	public String next() {

		generatedIsbn = isbnGenerator.next();
		return null;
	}
}
