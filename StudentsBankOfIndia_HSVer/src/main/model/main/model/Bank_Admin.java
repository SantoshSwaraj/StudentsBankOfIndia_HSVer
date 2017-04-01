package main.model;

public class Bank_Admin implements java.io.Serializable {
	private int emp_id;
	private String emp_fname;
	private String emp_mname;
	private String emp_lname;
	private String emp_design;
	private String emp_email;
	private String user_name;
	private String password;
	
	public Bank_Admin() {
	
	}

	public Bank_Admin(String emp_fname, String emp_mname, String emp_lname, String emp_design,String emp_email,
			String user_name, String password) {
		this.emp_fname = emp_fname;
		this.emp_mname = emp_mname;
		this.emp_lname = emp_lname;
		this.emp_design = emp_design;
		this.emp_email = emp_email;
		this.user_name = user_name;
		this.password = password;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_fname() {
		return emp_fname;
	}

	public void setEmp_fname(String emp_fname) {
		this.emp_fname = emp_fname;
	}

	public String getEmp_mname() {
		return emp_mname;
	}

	public void setEmp_mname(String emp_mname) {
		this.emp_mname = emp_mname;
	}

	public String getEmp_lname() {
		return emp_lname;
	}

	public void setEmp_lname(String emp_lname) {
		this.emp_lname = emp_lname;
	}

	public String getEmp_design() {
		return emp_design;
	}

	public void setEmp_design(String emp_design) {
		this.emp_design = emp_design;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
}
