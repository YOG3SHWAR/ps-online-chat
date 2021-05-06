package pod.one.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	public static Connection getMySQLConn() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/chatapp";
		String name = "shubham";
		String password = "shubham";
		
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, name, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
//	public Connection getOracleConn() {}
//	public Connection getDB2() {}
}
