package registration.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import registration.model.Customer;

public class CustomerRegisterDao {
	
	String sql ;
    static String url = "jdbc:mysql://localhost:3306/vehicledb";
	static String username= "root";
	static String password = "Dio110CC";
	static String dbdriver = "com.mysql.jdbc.Driver";
	
	public static void loadDriver(String dbdriver) {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			 con = DriverManager.getConnection(url,username,password);
		}
		catch (SQLException e){
		e.printStackTrace();
	}
		return con;
	}
	
	public static String insert(Customer cus) {
		
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "insert into Customer" + "(firstName, lastName, NIC, mobileNo, eMail, licenseNumber, password) values" + "(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cus.getFname());
			ps.setString(2, cus.getLname());
			ps.setString(3, cus.getNic());
			ps.setString(4, cus.getPnum());
			ps.setString(5, cus.getEmail());
			ps.setString(6, cus.getLnum());
			ps.setString(7, cus.getPass());
			ps.executeUpdate();
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
}
