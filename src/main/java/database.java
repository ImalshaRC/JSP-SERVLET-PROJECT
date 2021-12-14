import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class database {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicledb","root","");
			System.out.println("Database has connected");
			String s = "INSERT INTO vehicle " + "VALUES('my name is imalsha')";
			PreparedStatement st = con.prepareStatement(s);
			System.out.println("Data has inserted succesfully");
			st.execute();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
