package cs320.requests;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requests/PageCounter")
public class PageCounter extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		
		// Ensure the pageCounter variable exists and is initialized
		ServletContext context = this.getServletContext();
		
		if (context.getAttribute("simplePageCounter") == null){
			context.setAttribute("simplePageCounter", 0);
		}
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context = this.getServletContext();
		
		int pageCount = (int) context.getAttribute("simplePageCounter");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!doctype html>");
		out.println("<html lang=\"en\">");
		out.println("   <head>");
		out.println("      <title>CS320 Page Counter</title>");
		out.println("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
		out.println("   </head>");
		out.println("   <body>");
		out.println("      <h1>CS320 Page Counter</h1>");
		out.println("      <hr />");
		out.println("      <p class=\"lead\">This page has been viewed ");
		out.println(           ++pageCount);
		out.println("          time(s)</p>");
		out.println("   </body>");
		out.println("</html>");

		// Put the new value of pageCount back into the Servlet Context
		context.setAttribute("simplePageCounter", pageCount);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
