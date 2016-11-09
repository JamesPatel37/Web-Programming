package cs320.sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessions/IntroToSessions")
public class IntroToSessions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		// Does the counter already exist in the session?
		if (session.getAttribute("counter") == null)
			session.setAttribute("counter", 0);
		
		int count = (Integer) session.getAttribute("counter");
		
		// Increment the counter in the session
		session.setAttribute("counter", count + 1);
		
		// Print the HTML
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE html><html lang=\"en\">");
		writer.println("<head><title>Single Page Counter</title></head>");
		writer.println("<body>");
		
		writer.println("<h3>Session ID: " + session.getId() + "</h3>");
		
		writer.println("<h4>This page has been viewed " + count + " time(s).</h4>");
		
		writer.println("</body>");
		writer.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
