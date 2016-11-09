package cs320.homework1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/homework1/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;       

    public Register() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		boolean isValidFname = true;
		boolean	isValidLname = true;
		boolean	isValidEmail = true;
		boolean isValidPassword = true;
		boolean isValidRePassword = true;
		boolean isValidZip = true;
		
		boolean isFormSubmitted = false;

		if (request.getParameter("fname") != null) {
			if (request.getParameter("fname").trim().length() == 0)
				isValidFname = false;
		}

		if (request.getParameter("lname") != null) {
			if (request.getParameter("lname").trim().length() == 0)
				isValidLname = false;
		}

		if (request.getParameter("email") != null) {
			if (request.getParameter("email").trim().length() < 4)
				isValidEmail = false;
		}
		
		if (request.getParameter("pass") != null) {
			if (request.getParameter("pass").trim().length() == 0)
				isValidPassword = false;
		}

		if (request.getParameter("repass") != null) {
			if (request.getParameter("repass").trim().length() == 0)
				isValidRePassword = false;
		}

		if (request.getParameter("zip") != null) {
			if (request.getParameter("zip").trim().length() < 4)
				isValidZip = false;
		}


		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println(" 	<head>");
		out.println("		<meta charset='UTF-8'>");
		out.println("   	<title>CS320 Register Servlet</title>");
		out.println(" 		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
		out.println(" 	</head>");

		out.println("  	<body>");
		out.println("	<div class='container'>");
		out.println(" 	<hr>");
		out.println("	<h1>Registration Servlet<small> CS320 homework1</small></h1>");
		out.println(" 	<hr/>");
		out.println("	<form action=\"Register\" method=\"get\">");
		
		out.println("<input type=\"hidden\" name=\"PayPalID\" value=\"a234asd12\" />");

		out.print("   <input ");

		if (!isValidFname)
		out.println("   <p class='text-danger'>Enter a valid first name!</p>");
		out.print("<h4>First Name</h4>");
		out.print("   <input name='fname' ");
		
		if (request.getParameter("fname") != null && isValidFname)
		out.print(" value=" + request.getParameter("fname") + " ");
		out.println(" type='text' class='form-control' <br />");

		if (!isValidLname)
		out.println("   <p class='text-danger'>Enter a valid last name</p>");
		out.print("<h4>Last Name</h4>");
		out.print("   <input name='lname' ");
		
		if (request.getParameter("lname") != null && isValidLname)
		out.print(" value=" + request.getParameter("lname") + " ");
		out.println(" type='text' class='form-control' ><br />");

		if (!isValidEmail)
		out.println("   <p class='text-danger'>Enter a valid email</p>");
		out.print("<h4>E-mail</h4>");
		out.print("   <input name='email' ");
		
		if (request.getParameter("email") != null && isValidEmail)
		out.print(" value=" + request.getParameter("email") + " ");
		out.println(" type='text' class='form-control' ><br />");
		
		if (!isValidPassword)
		out.println("   <p class='text-danger'>Enter a valid password!</p>");
		out.print("<h4>Password</h4>");
		out.print("   <input name='pass' ");
		
		if (request.getParameter("pass") != null && isValidPassword)
		out.print(" value=" + request.getParameter("pass") + " ");
		out.println(" type='password' class='form-control' ><br />");

		if (!isValidRePassword)
		out.println("   <p class='text-danger'>password does not match</p>");
		out.print("<h4>Re-Enter Password</h4>");
		out.print("   <input name='repass' ");
		
		if (request.getParameter("repass") != null && isValidRePassword)
		out.print(" value=" + request.getParameter("repass") + " ");
		out.println(" type='password' class='form-control' ><br />");

		if (!isValidZip)
		out.println("   <p class='text-danger'>Enter a valid zipcode</p>");
		out.print("<h4>Zip Code</h4>");
		out.print("   <input name='zip' ");
		
		if (request.getParameter("zip") != null && isValidZip)
		out.print(" value=" + request.getParameter("zip") + " ");
		out.println(" type='text' class='form-control' ><br />");

		
		out.println("   	<a href='Register' class='btn btn-success'>Register</a></p></h1>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}
		@SuppressWarnings("unchecked")
		protected void doPost(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
/*			String FName = request.getParameter("Fname");
			String LName = request.getParameter("Lname");
			String email = request.getParameter("email");
			String password = request.getParameter("pass");
			String repassword = request.getParameter("repass");
			String zip = request.getParameter("zip");
			
			cs320.homework1.homework1Users post = new cs320.homework1.homework1Users(FName, LName, email, password, repassword, zip);

			List<cs320.homework1.homework1Users> posts = (List<cs320.homework1.homework1Users>) getServletContext()
					.getAttribute("posts");
			posts.add(post);

			response.sendRedirect("homework1Users");*/
			doGet(request, response);

		}
		
}