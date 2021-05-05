package pod.one.interfaces;

import java.sql.Date;

public interface IUpdateProfileDAO {
	//Update email
	public boolean updateEmail(int user_id, String email);
	
	//Update Name
	public boolean updateName(int user_id, String name);
	
	//Update password
	public boolean updatePassword(int user_id, String password);
	
	//Update d.o.b.
	public boolean updateDOB(int user_id, Date dob);
}
