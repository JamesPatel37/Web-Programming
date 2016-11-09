package webtest.servlet.lab2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lab2/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public HelloServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>CS320 - Web & Internet Programming</title>  <link rel= 'stylesheet' href= 'https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'</head><body>");
		
		out.println("<div class= 'container' ><div class= 'page-header' > <h1>CS320 Web &amp; Internet Programming <small>Laboratory 2</small> </h1>  </div>");    
		out.println("<hr/>");
		out.println("<p class= 'lead'> CIN: <strong>304380562 </strong>  </p>");   
    
		out.println("<p class= 'lead'> Name: <strong>Patel, Jaymin </strong>  </p>"); 
          
		out.println("<p class= 'bg-info text-center lead'> Hello, Servlet! </p>");             
                       
		out.println("<a href= 'http://cs3.calstatela.edu:8080/cs320stu43/lab2/HelloJSTL.jsp'> Hello, JSTL! </a>");
   
		out.println("</body> </html> ") ;                                                                                                     
		
	//	 request.getRequestDispatcher("/WEB-INF/HelloJSTL.jsp" ).forward(
	//            request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

