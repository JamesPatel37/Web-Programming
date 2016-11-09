package cs320.requests;

import cs320.requests.MessageBoardModel;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MessageBoard")
public class MessageBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;

    DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
    
	public MessageBoard() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		List<MessageBoardModel> posts = new ArrayList<MessageBoardModel>();
		
		posts.add(new MessageBoardModel(
				"C:/Users/Jaymin/workspace/webtest/WebContent/lab3/images/bean.png",
				"James", "Message Title", "Holla!"));
		posts.add(new MessageBoardModel(
				"C:/Users/Jaymin/workspace/webtest/WebContent/lab3/images/clint.png",
				"Joe", "Message Title", "Boines Noches!"));

		getServletContext().setAttribute("posts", posts);
	}

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		List<MessageBoardModel> posts = (List<MessageBoardModel>) getServletContext().getAttribute("posts");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println(" 	<head>");
		out.println("		<meta charset='UTF-8'>");
		out.println("   	<title>CS320 Message Board</title>");
		out.println("		<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'>");
		out.println(" 	</head>");

		out.println("  	<body>");

		out.println("<form action='MessagePost' method='post'>");

		out.println("<div class='container'>");
		out.println("<h1>Message Board <small>CS320</small>");
		out.println("<p class='pull-right'>");
		out.println("<a href='MessagePost' class='btn btn-primary'>Write Post</a> </p></h1><hr />");

		for (MessageBoardModel post : posts) {
			out.println("<div class='row'>");
			out.println("<div class='col-xs-offset-4 col-xs-4 col-md-offset-1 col-md-2'>");
			out.println("<img src=" + post.getImg() + " alt='Steve' class='img-circle img-responsive' /></div>");
			out.println("<div class='col-xs-12 col-md-offset-1 col-md-6'>");
			out.println("<h3>" + post.getTitle() + "</h3>");
			out.println("<p>" + post.getMessage() + "</p>");
			out.println("<p class='pull-right'><strong>- " + post.getName() + "</strong></p>");
			out.println("<p class='text-primary'>" + dateTimeInstance.format(Calendar.getInstance().getTime()) + "</p></div></div><hr />");
		}

		out.println("</form>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
