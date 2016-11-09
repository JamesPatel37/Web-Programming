package cs320.requests;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requests/SimpleAdder")
public class SimpleAdder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = 0,num2=0,sum=0; // Defined for scope;
		
		// The User is visiting our page for the first time
		// - Simply display the form
		boolean isFormSubmitted = false, isNum1Valid = true, isNum2Valid = true;
		
		// The User has submitted valid inputs for summation
		// - Add the values and display the results
		if ( request.getParameter("num1") != null || request.getParameter("num2") != null){
			isFormSubmitted = true;
			
			try{
				num1 = Integer.parseInt(request.getParameter("num1"));
			}catch(Exception e){
				isNum1Valid = false;
			}
			
			
			try{
				num2 = Integer.parseInt(request.getParameter("num2"));
			}catch(Exception e){
				isNum2Valid = false;
			}
			
			sum = num1 + num2;
		}
		
		if (!isNum1Valid || !isNum2Valid){
			response.sendRedirect("examples/Error.html");
		}
		
		// The User submitted erroneous data
		// - Display an error message to the User
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();		
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("	<head>");
		out.println(" 		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
		out.println("	</head>");
		out.println("	<body>");
		out.println(" 		<h1>Simple Adder <small>CS320</small></h1><hr />");
		
		out.println("<form action=\"SimpleAdder\" method=\"get\">");
		
		out.println("<input type=\"hidden\" name=\"PayPalID\" value=\"a234asd12\" />");
		
		
		out.print("   <input ");
		
		if (!isNum1Valid)
			out.print("class=\"bg-danger\" ");
		else if (isFormSubmitted)
			out.print("value=\"" + num1 + "\" ");
			
		out.print("type=\"text\" ");		
		out.println(" name=\"num1\" placeholder=\"Enter a number\" /> +");
		
		
		out.print("   <input type=\"text\" ");
		out.println("   name=\"num2\" placeholder=\"Enter another number\" /> =");
		
		
		//out.print("   <input type=\"text\" readonly ");
		//out.println(" placeholder=\"The Sum\" /> <br /><br />");
		if (isFormSubmitted && isNum1Valid && isNum2Valid){
			out.println("<h3>" + num1 + " + " + num2 + " = " + sum + "</h3>");
		}
		else if(!isNum1Valid || !isNum2Valid){
			out.println("<p class=\"bg-danger\">Invalid Input</p>");
		}
		
		
		out.println("   <input type=\"submit\" value=\"Add\" class=\"btn btn-warning\" />");
		out.println("</form>");
		
		out.println("	</body>");
		out.println("</html>");	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
