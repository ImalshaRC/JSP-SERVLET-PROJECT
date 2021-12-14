package registration.dao;

import java.sql.Connection;



import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import registration.model.Reviews;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import registration.dao.DBconnect;

public class updateReviewDao {
	
	private static Connection conn = null;
	private static Statement stmt1 =null;
	static boolean isSucess;

	public static boolean updateReview(String id, String rate, String feedback) {
		
		try {
			int ID = Integer.parseInt(id);
			conn = DBconnect.getConnection();
			stmt1 = conn.createStatement();
			String sql = "update Reviews set rating='"+rate+"',feedback='"+feedback+"'"+"WHERE reviewID='"+ID+"'";
			int rs1 = stmt1.executeUpdate(sql);
			
			if(rs1 > 0) {
				isSucess = true;
			}else{
				isSucess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSucess;
	}
	
	public static List<Reviews> getReviewData(int cusid) {
		
		ArrayList<Reviews> revs = new ArrayList<>();
		
		try {
			
			conn = DBconnect.getConnection();
			stmt1 = conn.createStatement();
			String sql = "select * from Reviews where cusID='"+cusid+"'";
			ResultSet rs1 = stmt1.executeQuery(sql);
			
			while(rs1.next()) {
				int revid = rs1.getInt(1);
				int rate = rs1.getInt(3);
				String feedback = rs1.getString(4);
				
				Reviews re = new Reviews(rate, feedback);
				re.setId(revid);
				revs.add(re);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return revs;
	}
	
	public static boolean deleteReviewData(String id) {
		
		int ID = Integer.parseInt(id);
		
		try {
			
			conn = DBconnect.getConnection();
			stmt1 = conn.createStatement();
			String sql = "delete from Reviews where reviewID='"+ID+"'";
			int rs1 = stmt1.executeUpdate(sql);
			
			if(rs1 > 0) {
				isSucess = true;
			}else{
				isSucess = false;
			}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		return isSucess;
		
		
		
	}
	
}
