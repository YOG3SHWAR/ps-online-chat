package com.sapient.chat.exceptions;

public class AgeLessThan18Exception extends Exception{
	private String message;
	
	public AgeLessThan18Exception() {
		message = "Age Less Than 18 Exceptions";
	}

	public AgeLessThan18Exception(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "AgeLessThan18Exception [message=" + message + "]";
	}
	
}
