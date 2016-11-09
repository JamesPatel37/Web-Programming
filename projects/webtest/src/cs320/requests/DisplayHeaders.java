package cs320.requests;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/requests/DisplayHeaders")
public class DisplayHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
		response.setContentType("application/vnd.ms-excel");
		
		PrintWriter out = response.getWriter();
	
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("	<head>");
		out.println(" 		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
		out.println("	</head>");
		out.println("	<body>");
		out.println(" 	<hr><h1>Display Headers <small>CS320</small></h1><hr/>");
		
		out.println("<table class=\"table\"> <tr> <th>Header</th> <th>Value</th> </tr>");

		Enumeration<String> headerNames = request.getHeaderNames();
		
		while ( headerNames.hasMoreElements() ){
			String headerName = headerNames.nextElement();
			
			out.println("<tr>");
			out.println("   <td>" + headerName + "</td>");
			out.println("   <td>" + request.getHeader(headerName) + "</td>");
			out.println("</tr>");
		}

		out.println("</table>");

		out.println("	</body>");
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
    


