package cs320.sessions.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessions/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init() throws ServletException {
		
		ServletContext context = this.getServletContext();
		
		if (context.getAttribute("SessionsUsers") == null){
			ArrayList<SessionsUser> users = new ArrayList<SessionsUser>();
			users.add(new SessionsUser("John", "Doe", "john@doe.com", "1!"));
			users.add(new SessionsUser("Joe", "Boxer", "joe@boxer.com", "2@"));
			users.add(new SessionsUser("Jane", "Doe", "jane@doe.com", "3#"));
			
			context.setAttribute("SessionsUsers", users);
		}
			
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		if (request.getParameter("action") != null && request.getParameter("action").equals("logout")){
			session.invalidate();			
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("	<meta charset=\"UTF-8\">");
		out.println("	<title>Login</title>");
		out.println("	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=\"container\">");
		out.println("	<div class=\"page-header\">");
		out.println("		<h1>Login <small> Sessions &amp; Cookies</small></h1>");
		out.println("	</div>");
		
		if (request.getAttribute("error") != null)
			out.println("<p class=\"text-danger\">" + request.getAttribute("error") + "</p>");
		
		out.println("	<form action=\"Login\" method=\"post\">");
		out.println("      <input type=\"text\" placeholder=\"Username\" name=\"username\" />");
		out.println("      <br />");
		out.println("      <input type=\"password\" placeholder=\"Password\" name=\"password\" />");
		out.println("      <br />");
		out.println("      <input class=\"btn btn-success\" type=\"submit\" value=\"Login\" />");
		out.println("      <br />");
		out.println("      <input type=\"checkbox\" name=\"rememberMe\" /> Remember Me");
		out.println("	</form>");
		
		out.println("</div>");
		out.println("</body>");
		out.println("</html>	");	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = this.getServletContext();
		ArrayList<SessionsUser> users = (ArrayList<SessionsUser>) context.getAttribute("SessionsUsers");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Search the list of Users to find a user that matches
		// the supplied credentials
		for (SessionsUser user : users){
			if (user.getEmail().equals(username) && user.getPassword().equals(password)){
				// The User submitted valid credentials
				
				// Create a Session
				HttpSession session = request.getSession();
				
				// Add a reference to the User object to the Session Scope
				session.setAttribute("SessionUser", user);
				
				// Redirect the User to a Welcome Servlet
				response.sendRedirect("Welcome");
				
				break;
			}
		}
		
		
		request.setAttribute("error", "Invalid Username and/or Password");
		doGet(request, response);
	}

}







