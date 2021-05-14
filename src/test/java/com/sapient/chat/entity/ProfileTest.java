package com.sapient.chat.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProfileTest {
	private Profile profile = new Profile();

	@Test
	@DisplayName("Should Return Email Correctly.")
	void should_ReturnEmail_When_EmailRequested() {
		profile.setEmail("test@test.com");
		String expected = "test@test.com";
		String actual = profile.getEmail();
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Should Return Password Correctly.")
	void should_ReturnPassword_When_PasswordRequested() {
		profile.setPassword("123456");
		String expected = "123456";
		String actual = profile.getPassword();
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Should Return Name Correctly.")
	void should_ReturnName_When_NameRequested() {
		profile.setName("Publicis Sapient");
		String expected = "Publicis Sapient";
		String actual = profile.getName();
		
		assertEquals(expected, actual);
	}
}
