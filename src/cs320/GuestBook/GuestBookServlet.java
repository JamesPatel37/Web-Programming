package cs320.GuestBook;

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

@WebServlet("/GuestBook/GuestBookServlet")
public class GuestBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void init() throws ServletException {
		if ( this.getServletContext().getAttribute("GuestBookPosts") == null)
		{
			ArrayList<GuestBookPost> posts = new ArrayList<GuestBookPost>();
			
			// Pre-Populate the ArrayList
			posts.add(new GuestBookPost("John Doe", "Hello, World!"));
			posts.add(new GuestBookPost("Joe Boxer", "Game Over!"));
			
			// Add the arraylist to the ServletContext
			this.getServletContext().setAttribute("GuestBookPosts", posts);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletContext context = this.getServletContext();
		ArrayList<GuestBookPost> posts = (ArrayList<GuestBookPost>) context.getAttribute("GuestBookPosts");
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("	<head>");
		out.println(" 		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
		out.println("	</head>");
		out.println("	<body>");
		out.println(" 		<h1>Guest Book Servlet <small>CS320</small></h1><hr />");
		
		for (GuestBookPost post : posts){
			out.println("<p class=\"lead\">" 
						+ post.getMessage() 
						+ " - <strong>" 
						+ post.getName()
						+ "</strong><small>"
						+ post.getDatePosted() + "</small></p>");
		}
		
		out.println("<form action=\"GuestBookServlet\" method=\"post\">");
		out.println("   <input type=\"text\" name=\"name\" placeholder=\"Enter your name\" /><br />");
		out.println("   <textarea name=\"message\" rows=\"3\" cols=\"15\" placeholder=\"Enter a message\"></textarea><br />");
		out.println("   <input type=\"submit\" value=\"Post\" />");
		out.println("</form>");
		
		out.println("	</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String message = request.getParameter("message");
		
		if(name != null && name.trim().length() > 0 && message != null && message.trim().length() > 0){
			// Add a new post
			ArrayList<GuestBookPost> posts = (ArrayList<GuestBookPost>) this.getServletContext().getAttribute("GuestBookPosts");
			posts.add( new GuestBookPost(name, message) );
		}
		
		doGet(request, response);
	}

}
