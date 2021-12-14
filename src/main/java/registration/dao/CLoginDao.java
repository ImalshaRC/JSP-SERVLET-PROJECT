package registration.dao;

import java.util.*;

import registration.model.Customer;
import registration.model.Reviews;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CLoginDao {
	
	private static Connection conn = null;
	private static Statement stmt =null;
	private static ResultSet rs = null;
	
	
	public static List<Customer> getCustDetails(String email, String password){
		
		
		ArrayList<Customer> cust = new ArrayList<>();
		
		try {
			
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM Customer where eMail='"+email+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int customerID = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String NIC = rs.getString(4);
				String mobNo = rs.getString(5);
				String Email = rs.getString(6);
				String licenseNumber = rs.getString(7);
				String password1 = rs.getString(8);
				
				Customer cus = new Customer(firstName, lastName, NIC, mobNo,Email, licenseNumber, password1);
				cust.add(cus);
				cus.setCustomerID(customerID);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cust;
	}
}
