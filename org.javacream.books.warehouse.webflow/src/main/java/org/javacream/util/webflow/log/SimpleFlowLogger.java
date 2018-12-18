package org.javacream.util.webflow.log;

import org.springframework.stereotype.Component;

@Component
public class SimpleFlowLogger {

	public void log(String phase, String message){
		System.out.println("Phase " + phase + ", message=" + message);
	}
}
