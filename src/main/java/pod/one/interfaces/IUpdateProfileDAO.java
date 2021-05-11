package pod.one.interfaces;

import java.time.LocalDate;

import pod.one.exceptions.AgeLessThan18Exception;
import pod.one.exceptions.EmailNotValidException;
import pod.one.exceptions.NameTooSmallException;
import pod.one.exceptions.PasswordNotStrongException;

public interface IUpdateProfileDAO {
	//Update email
	public boolean updateEmail(int userId, String email) throws EmailNotValidException;
	
	//Update Name
	public boolean updateName(int userId, String name) throws NameTooSmallException;
	
	//Update password
	public boolean updatePassword(int userId, String password) throws PasswordNotStrongException;
	
	//Update d.o.b.
	public boolean updateDOB(int userId, LocalDate dob) throws AgeLessThan18Exception;
}
