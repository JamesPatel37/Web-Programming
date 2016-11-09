package cs320.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletPath")
public class ServletPath extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		//ServletOutputStream outStream = response.getOutputStream();
		//outStream.write(b);
		
		response.setContentType("text/html");
		
		out.println("<pre>");
		
		ServletContext context = this.getServletContext();
		
		out.println(context.getContextPath());
		out.println(context.getServletContextName());
		out.println(context.getRealPath(context.getContextPath()));
		out.println(context.getServerInfo());
		
		out.println("</pre>");
		
		String path = context.getRealPath(context.getContextPath());
		String filename = "GetImageServlet.html";
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
