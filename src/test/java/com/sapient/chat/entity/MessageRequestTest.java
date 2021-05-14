package com.sapient.chat.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.sapient.chat.dao.MessageRequestDAO;
import com.sapient.chat.dao.UpdateProfileDAO;
import com.sapient.chat.exceptions.EmailNotValidException;
import com.sapient.chat.exceptions.NameTooSmallException;
import com.sapient.chat.interfaces.IMessageRequestDAO;
import com.sapient.chat.interfaces.IUpdateProfileDAO;

class MessageRequestTest {

	private MessageRequest messageRequest = new MessageRequest();
	
	@Test
	@DisplayName("Should Return Request Id Correctly.")
	public void should_ReturnRequestId_When_RequestIdRequested() {
		messageRequest.setRequestId(10);
		int expected=10;
		int actual = messageRequest.getRequestId();
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Should Return Sender Id Correctly.")
	public void should_ReturnSenderId_When_SenderIdRequested() {
		messageRequest.setSenderId(10005);
		int expected = 10005;
		int actual = messageRequest.getSenderId();
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Should Return Receiver Id Correctly.")
	public void should_ReturnReceiverId_When_ReceiverIdRequested() {
		messageRequest.setReceiverId(10003);
		int expected = 10003;
		int actual = messageRequest.getReceiverId();
	
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Should Return Message Body Correctly.")
	public void should_ReturnMessaegBody_When_MessageBodyRequested() {
		messageRequest.setMessageBody("Hi");
		String expected = "Hi";
		String actual = messageRequest.getMessageBody();
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Should Return True When Message Request Accepted.")
	public void should_ReturnTrue_When_MessageRequestAccepted() {
		messageRequest.setIsAccepted(1);
		int expected = 1;
		int actual = messageRequest.getIsAccepted();
		
		assertEquals(expected, actual);
	}
}
