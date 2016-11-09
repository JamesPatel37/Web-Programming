package cs320.responses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responses/Spreadsheet")
public class Spreadsheet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		//response.setContentType("text/html");
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=Fruits.xls");
		
		out.println("\tQ1\tQ2\tQ3\tQ4\tTotal");
		out.println("Apples\t78\t45\t26\t80\t=SUM(B2:E2)");
		out.println("Oranges\t33\t47\t52\t14\t=SUM(B3:E3)");
		/*
		out.println("<table>");
		out.println("  <tr>");
		out.println("    <th>Fruit</th>");
		out.println("    <th>Q1</th>");
		out.println("    <th>Q2</th>");
		out.println("    <th>Q3</th>");
		out.println("    <th>Q4</th>");
		out.println("  </tr>");
		out.println("  <tr>");
		out.println("    <td>Apples</td>");
		out.println("    <td>78</td>");
		out.println("    <td>45</td>");
		out.println("    <td>26</td>");
		out.println("    <td>80</td>");
		out.println("  </tr>");
		out.println("    <td>Oranges</td>");
		out.println("    <td>33</td>");
		out.println("    <td>47</td>");
		out.println("    <td>52</td>");
		out.println("    <td>14</td>");
		out.println("  </tr>");
		out.println("</table>");
		*/
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
