import java.sql.*;

public class databaseConnect {

	public static void main(String[] args) {
		/*try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicledb","root","");
			System.out.println("Database has connected");
			String s = "INSERT INTO vehicle VALUES('my name is imalsha')";
			PreparedStatement st = con.prepareStatement(s);
			System.out.println("Data has inserted succesfully");
			st.execute();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}*/
		
		vehiclwDAO dao = new vehiclwDAO();
		vehicle v1 = dao.getVehicle(1);
		System.out.println(v1.name);

	}
	
	public class vehiclwDAO{
		public vehicle getVehicle(int rollNO) {
			try{
				String query = "SELECT reviews FROM vehicle WHERE rollno="+rollNO;
				vehicle v = new vehicle();
				v.rollno = rollNO;
				class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicledb","root","Dio110CC");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);
				rs.next();
				String name = rs.getString(1);
			    v.name = name;
				return v;
			
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public class vehicle{
		String name;
		int rollno;
	}

}
