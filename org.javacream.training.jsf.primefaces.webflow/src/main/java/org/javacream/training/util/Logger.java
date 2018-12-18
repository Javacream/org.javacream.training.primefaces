package org.javacream.training.util;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class Logger {

	public void logMessage(String message) {
		System.out.println(message);
	}
}
