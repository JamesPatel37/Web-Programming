package Midterm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Midterm.Model;

@WebServlet("/Midterm/CarAdmin")
public class CarAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

/*
    public void init( ServletConfig config ) throws ServletException
    {
    	ServletContext context = this.getServletContext();
    	
    	ArrayList<Car> cars = new ArrayList<Car>();
    	
    	if (context.getAttribute("cars")== null)
    		context.getAttribute("cars",cars);
        super.init( config );

        // create some test data for display
        List<Model> entries = new ArrayList<Model>();
        entries.add(new Model("Honda","Civic", 2012));
        entries.add(new Model("Honda","Accord",2000));

        // stored the data somewhere that can be accessed by this servlet
        // and other servlets.
        getServletContext().setAttribute( "entries", entries );
    }*/
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		boolean isValidMake = true;
		boolean isValidYear = true;
		boolean isValidModel = true;

		if (request.getParameter("make") != null) {
			if (request.getParameter("make").trim().length() == 0)
				isValidMake = false;
		}

		if (request.getParameter("model") != null) {
			if (request.getParameter("model").trim().length() == 0)
				isValidModel = false;
		}

		if (request.getParameter("year") != null) {
			if (request.getParameter("year").trim().length() < 4)
				isValidYear = false;
		}

		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class='container'>");
		out.println("<h1>Car Administrator<small> CS320 Midterm</small></h1><hr />");
		out.println("<form action='CarAdmin' method='get'>");

		if (!isValidMake)
		out.println("   <p class='text-danger'>Enter a valid make!</p>");
		out.print("<h4>Make</h4>");
		out.print("   <input name='make' ");
		
		if (request.getParameter("make") != null && isValidMake)
		out.print(" value=" + request.getParameter("make") + " ");
		out.println(" type='text' class='form-control' placeholder='Ex: Honda, Lexus, etc...'><br />");

		if (!isValidModel)
		out.println("   <p class='text-danger'>Enter a valid Model</p>");
		out.print("<h4>Model</h4>");
		out.print("   <input name='model' ");
		
		if (request.getParameter("model") != null && isValidMake)
		out.print(" value=" + request.getParameter("model") + " ");
		out.println(" type='text' class='form-control' placeholder='Ex: Civic, Accord, IS300, etc...'><br />");

		if (!isValidYear)
		out.println("   <p class='text-danger'>Enter a valid firstYear</p>");
		out.print("<h4>Year</h4>");
		out.print("   <input name='year' ");
		
		if (request.getParameter("year") != null && isValidYear)
		out.print(" value=" + request.getParameter("year") + " ");
		out.println(" type='text' class='form-control' placeholder='Ex: 1999, 2014, etc...'><br />");

		out.println("   <input type='submit' class='btn btn-default' value='Add'>");
		
		out.println("<h1>Current Inventory</h1><hr />");
		out.println("<h4>Search</h4>");
		out.println("   <input name='Model' type='text' class='form-control' placeholder='Enter a search term! '<br /><br /> ");
		out.println("<h4>Search Field</h4>");
		out.println("<select name='searchField' class='form-control'><br />");
		out.println("<option value='Make'>Make</option>");
		out.println("<option value='Model'>Model</option>");
		out.println("<option value='Year'>Year</option></select><br />");

		out.println("<p class='text-center'> <input class='btn btn-default' type='submit' value='Search'></p><hr /><br />");

		//Table
		out.println("<table class='table table-striped'>");
		out.println("<tr>");
		out.println("<td>");
		out.println("<th>Make</th>");
		out.println("<th>Model</th>");
		out.println("<th>Year</th>");
		out.println("<th></th>");
		out.println("</td>");
		out.println("</table>");

		out.println("</form>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
/*		 String make = request.getParameter("make").trim();
		 String model = request.getParameter("model").trim(); 
		 String year = request.getParameter("year").trim();
		 
		 Model post = new Model(make, model, year);
		 
		 List<Model> posts = (List<Model>)getServletContext().getAttribute("posts"); 
		 posts.add(post);
		 
		 response.sendRedirect("CarAdmin");*/
		 
	}

}
