package cs320.responses;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responses/ResponseCountdown")
public class ResponseCountdown extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		int countdown = 0;  // Defined here for scope
		
		if (request.getParameter("countdown") != null){
			try{
				countdown = Integer.parseInt(request.getParameter("countdown"));
				
				// Create the cookie
				Cookie cookie = new Cookie("countdown", Integer.toString(countdown));
				//  Add the cookie to the response
				response.addCookie(cookie);
				
				response.sendRedirect("ResponseCountdown");
				
			}catch(Exception e){
				// Nothing to do
			}
		}
		else{
			Cookie[] cookies = request.getCookies();
			if (cookies != null){
				for (Cookie cookie : cookies){
					if (cookie.getName().equals("countdown")){
						countdown = Integer.parseInt( cookie.getValue() );
						countdown--;
						
						if (countdown > 0){
							response.addCookie( new Cookie("countdown", Integer.toString(countdown)));
							response.setIntHeader("Refresh", 1);
						}
						break;
					}
				}
			}
		}
		
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("	<head>");
		out.println(" 		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
		out.println("	</head>");
		out.println("	<body>");
		out.println(" 		<h1>Countdown value is: " + countdown + "</h1>");
		
		out.println("	</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
