package pod.one.client;

import java.sql.Date;

import pod.one.dao.MessageRequestDAO;
import pod.one.dao.UpdateProfileDAO;
import pod.one.entity.MessageRequest;
import pod.one.interfaces.IMessageRequestDAO;
import pod.one.interfaces.IUpdateProfileDAO;

public class App {
	public static void main(String[] args) {
		MessageRequest m = new MessageRequest();
		m.setSender_id(10005);
		m.setReceiver_id(10003);
		m.setMessage_body("Hi");
		m.setIs_accepted(1);
		
		IMessageRequestDAO dao = new MessageRequestDAO();
		IUpdateProfileDAO dao1 = new UpdateProfileDAO();
//		
//		System.out.println(dao1.updateName(10001, "User1")? "Name" : "Name error");
//		System.out.println(dao1.updateEmail(10001, "u1@yahoo.com")? "Email" : "Email error");
		System.out.println(dao1.updatePassword(10001, "User3")? "Password" : "Password error");
//		System.out.println(dao1.updateDOB(10001, Date.valueOf("2000-02-12"))? "DOB" : "DOB error");
//		System.out.println(dao.saveMessage(m) ? "Inserted" : "Not Inserted");
//		System.out.println(dao.getMessage(02));
//		System.out.println(dao.getAllMessages());
//		System.out.println(dao.updateRequest(1, 1) ? "Updated" : "Not updated");
//		
	}
	
	
}
