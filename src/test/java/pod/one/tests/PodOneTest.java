package pod.one.tests;


//import static org.junit.Assert.*;
//import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pod.one.dao.MessageRequestDAO;
import pod.one.dao.UpdateProfileDAO;
import pod.one.entity.MessageRequest;
import pod.one.interfaces.IMessageRequestDAO;
import pod.one.interfaces.IUpdateProfileDAO;

public class PodOneTest {

	private MessageRequest m = null;
	private IMessageRequestDAO dao = null;
	private IUpdateProfileDAO dao1 = null;
	
	@BeforeEach
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
	@DisplayName("Message Post Test")
	public void messagePostTest() {
		assertEquals(true , dao.saveMessage(m));
	}
	
	@Test
	@DisplayName("Sender Id Test")
	public void isSenderIDCorrect() {
		assertEquals(10005 , m.getSender_id());
	}
	
	@Test
	@DisplayName("Receiver Id Test")
	public void isRecieverIDCorrect() {
		assertEquals(10003 , m.getReceiver_id());
	}
	
	@Test
	@DisplayName("Get All Message Test")
	public void getAllMessages() {
		assertNotEquals(0 , dao.getAllMessages().size());
	}
	
	@Test
	@DisplayName("name Update Test")
	public void isNameUpdatedCorrectly() {
		assertEquals(false , dao1.updateName(124, "ABC"));
	}
	
	@Test
	@DisplayName("Email Update Test")
	public void isEmailUpdatedCorrectly() {
		assertEquals(false , dao1.updateEmail(124, "abc@gmail.com"));
	}
}
