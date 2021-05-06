package com.sapient.message.tests;

import static org.junit.Assert.*;

import org.junit.*;

import pod.one.dao.*;
import pod.one.entity.MessageRequest;
import pod.one.interfaces.*;

public class MessageTest {

	private MessageRequest m = null;
	private IMessageRequestDAO dao = null;
	private IUpdateProfileDAO dao1 = null;
	
	@Before
	public void setUp() {
		m = new MessageRequest();
		dao = new MessageRequestDAO(); 
		dao1 = new UpdateProfileDAO();

		m.setSender_id(10005);
		m.setReceiver_id(10003);
		
		m.setMessage_body("Hi");
		m.setIs_accepted(1);
	}
	
	@Test
	public void messagePostTest() {
		assertEquals(true , dao.saveMessage(m));
	}
	
	@Test
	public void isSenderIDCorrect() {
		assertEquals(10005 , m.getSender_id());
	}
	
	@Test
	public void isRecieverIDCorrect() {
		assertEquals(10003 , m.getReceiver_id());
	}
	
	@Test
	public void getAllMessages() {
		assertEquals(19 , dao.getAllMessages().size());
	}
	
	@Test
	public void isNameUpdatedCorrectly() {
		assertEquals(false , dao1.updateName(124, "ABC"));
	}
	
	@Test
	public void isEmailUpdatedCorrectly() {
		assertEquals(false , dao1.updateEmail(124, "abc@gmail.com"));
	}
}
