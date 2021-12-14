package registration.dao;

import java.util.*;

import registration.model.Customer;
import registration.model.Reviews;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class retriewReviewDao {
	
	private static Connection conn = null;
	private static Statement stmt =null;
	private static ResultSet rs = null;
	
	
	public static List<Reviews> getReviewDetails(String cusID){
		
		ArrayList<Reviews> rev = new ArrayList<>();
		ArrayList<Customer> cust = new ArrayList<>();
		
		try {
			
			conn = DBconnect.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM Reviews where cusID='"+cusID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String cusid = rs.getString(2);
				int rating = rs.getInt(3);
				String fb = rs.getString(4);
				
				
				Reviews rvs = new Reviews(rating, fb);
				rvs.setId(id);
				rev.add(rvs);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rev;
	}
}
