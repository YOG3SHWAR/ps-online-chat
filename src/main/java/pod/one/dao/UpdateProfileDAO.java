package pod.one.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pod.one.interfaces.IUpdateProfileDAO;
import pod.one.utils.GetConnection;

public class UpdateProfileDAO implements IUpdateProfileDAO{

	public boolean updateEmail(int user_id, String email) {
		// TODO Auto-generated method stub
		String sql = "update users set email = ? where user_id = ?";
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setString(1, email);
			ps.setInt(2, user_id);
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean updateName(int user_id, String name) {
		// TODO Auto-generated method stub
		String sql = "update users set name = ? where user_id = ?";
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, user_id);
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean updatePassword(int user_id, String password) {
		// TODO Auto-generated method stub
		String sql = "update users set password = ? where user_id = ?";
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setString(1, password);
			ps.setInt(2, user_id);
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateDOB(int user_id, Date dob) {
		// TODO Auto-generated method stub
		String sql = "update users set dob = ? where user_id = ?";
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setDate(1, dob);
			ps.setInt(2, user_id);
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
