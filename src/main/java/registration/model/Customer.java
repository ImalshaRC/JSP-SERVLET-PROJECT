package registration.model;

public class Customer extends User{

	
	
	
	public Customer() {
		super();
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLnum() {
		return lnum;
	}

	public void setLnum(String lnum) {
		this.lnum = lnum;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public static int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public Customer(String fname, String lname, String nic, String pnum, String email, String lnum, String pass) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.nic = nic;
		this.pnum = pnum;
		this.email = email;
		this.lnum = lnum;
		this.pass = pass;
	}
	
}
