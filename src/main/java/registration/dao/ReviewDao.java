package registration.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import registration.model.Reviews;
import registration.model.Customer;

public class ReviewDao {
	
	static boolean isSuccess = false;
	
	public static boolean register(Reviews r) throws ClassNotFoundException {
		
		String insert_sql = "INSERT INTO Reviews "+"(cusID, rating, feedback) VALUES"+"(?, ?, ?);";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicledb","root","Dio110CC");
			PreparedStatement pstm = con.prepareStatement(insert_sql)){
				pstm.setInt(1, Customer.getCustomerID());
				pstm.setInt(2, r.getRating());
				pstm.setString(3, r.getMessage());
				System.out.println(pstm);
				
				result = pstm.executeUpdate();
				
				if(result > 0) {
					isSuccess = true;
				}else {
					isSuccess = false;
				}
				
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}

}
