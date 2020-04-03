package WeCode;

public abstract class User {

	String uname;
	String uemail;


	public User() {
		super();
		uname="";
		uemail="";
	}


	public User(User user) {
		this.uname = user.getUname();
		this.uemail = user.getUemail();
	}


	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}


	@Override
	public String toString() {
		return "User [uname=" + uname + ", uemail=" + uemail + "]";
	}
	
	public abstract void printDetails();
	
	
}
