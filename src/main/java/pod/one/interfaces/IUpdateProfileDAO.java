package pod.one.interfaces;

import java.time.LocalDate;

import pod.one.exceptions.AgeLessThan18Exception;
import pod.one.exceptions.EmailNotValidException;
import pod.one.exceptions.NameTooSmallException;
import pod.one.exceptions.PasswordNotStrongException;

public interface IUpdateProfileDAO {
	//Update email
	public boolean updateEmail(int user_id, String email) throws EmailNotValidException;
	
	//Update Name
	public boolean updateName(int user_id, String name) throws NameTooSmallException;
	
	//Update password
	public boolean updatePassword(int user_id, String password) throws PasswordNotStrongException;
	
	//Update d.o.b.
	public boolean updateDOB(int user_id, LocalDate dob) throws AgeLessThan18Exception;
}
