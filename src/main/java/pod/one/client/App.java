package pod.one.client;

import java.sql.Date;
import java.time.LocalDate;

import pod.one.dao.MessageRequestDAO;
import pod.one.dao.UpdateProfileDAO;
import pod.one.entity.MessageRequest;
import pod.one.exceptions.AgeLessThan18Exception;
import pod.one.exceptions.EmailNotValidException;
import pod.one.exceptions.NameTooSmallException;
import pod.one.exceptions.PasswordNotStrongException;
import pod.one.interfaces.IMessageRequestDAO;
import pod.one.interfaces.IUpdateProfileDAO;

public class App {
	public static void main(String[] args) {
		MessageRequest m = new MessageRequest();
		m.setSenderId(10005);
		m.setReceiverId(10003);
		m.setMessageBody("Hi");
		m.setIsAccepted(1);
		
		IMessageRequestDAO dao = new MessageRequestDAO();
		IUpdateProfileDAO dao1 = new UpdateProfileDAO();
		
//		try {
//			System.out.println(dao1.updateName(10001, "User1")? "Name Updated" : "Name Not Updated");
//		} catch (NameTooSmallException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
//		try {
//			System.out.println(dao1.updateEmail(10001, "u1@yahoo.com")? "Email Updated" : "Email Not updated");
//		} catch (EmailNotValidException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			System.out.println(dao1.updatePassword(10001, "User3@789")? "Password Updated" : "Password Not updated");
//		} catch (PasswordNotStrongException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			System.out.println(dao1.updateDOB(10001, LocalDate.of(2000, 2, 12))? "DOB Updated" : "DOB Not updated");
//		} catch (AgeLessThan18Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
//		System.out.println(dao.saveMessage(m) ? "Inserted " : "Not Inserted");
//		System.out.println(dao.getMessage(02));
//		System.out.println(dao.getAllMessages());
//		System.out.println(dao.updateRequest(1, 1) ? "Updated" : "Not updated");
//		
	}
	
	
}
