package registration.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	private static String url = "jdbc:mysql://localhost:3306/vehicledb";
	private static String userName = "root";
	private static String password = "Dio110CC";
	private static Connection conn;
	
	public static Connection getConnection() {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, userName, password);
		
	}catch(Exception e) {
		System.out.println("database connection is not success");
	}
	return conn;
	
	}
	
}
