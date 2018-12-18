package org.javacream.greeter.web;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class GreeterWebBean {

	private boolean friendly;
	public boolean isFriendly() {
		return friendly;
	}

	public void setFriendly(boolean friendly) {
		this.friendly = friendly;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private String greeting;

	public String getGreeting() {
		return greeting;
	}
	
	public String greet() {
		if (friendly) {
			greeting = "Hello " + name + "!"; 
		}else {
			greeting = name;
		}
		
		return "";
	}
	
}
