package cs320.homework1;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/homework1Users")
public class homework1Users extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String FName;
	String LName;
	String email;
	String password;
	String repassword;
	String zip;
	
	public homework1Users(String FName, String LName, String email, String password, String repassword, String zip){
		this.FName = FName;
		this.LName = LName;
		this.email = email;
		this.password = password;
		this.repassword = repassword;
		this.zip = zip;
	}
	
	
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		List<cs320.homework1.homework1Users> posts = new ArrayList<cs320.homework1.homework1Users>();
		
		posts.add(new cs320.homework1.homework1Users("James","Patel", "james.patel37@gmail.com", "$JP37","$JP37","396195"));
		posts.add(new cs320.homework1.homework1Users("Jammy","Patel", "jammy.patel37@gmail.com", "$JP37","$JP37","396195"));

		getServletContext().setAttribute("posts", posts);
	}
  

}
