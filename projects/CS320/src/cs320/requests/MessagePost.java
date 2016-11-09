package cs320.requests;

import cs320.requests.MessageBoardModel;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lab3/MessagePost")
public class MessagePost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

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
		out.println("	<form action='MessagePost' method='post'>");
		out.println(" 	<hr>");
		out.println("       <h1>Message Board <small>CS320</small>");
		out.println(" 		<p class='pull-right'>");
		out.println("   	<a href='MessageBoard' class='btn btn-success'>View Posts</a></p></h1>");
		out.println(" 	<hr/>");

		out.println("<div class='row'>");
		out.println("<div class='col-md-offset-2 col-md-8'>");

		out.println("<p class='lead'><input name='name' type='text' class='form-control' placeholder='Enter Your Name'><p>");
		out.println("<p class='lead'><input name='title' type='text' class='form-control' placeholder='Post Title'><p>");
		out.println("<p class='lead'><textarea name='message' placeholder='Message' class='form-control' rows='3'></textarea></p></div></div>");

		

		out.println("<div class='row text-center'>");
		out.println("<div class='col-md-offset-2 col-md-2'>");
		out.println("	<img src='http://cs3.calstatela.edu:8080/cs320stu43/lab3/images/bean.png' alt='Mr. Bean' class='img-circle img-responsive' />");
		out.println("	<input type='radio' name='image' value='bean.png' checked='true' />");
		out.println("</div>");

		out.println("<div class='col-md-2'>");
		out.println("	<img src='http://cs3.calstatela.edu:8080/cs320stu43/lab3/images/clint.png' alt='Clint Eastwood' class='img-circle img-responsive' />");
		out.println("	<input type='radio' name='image' value='clint.png' />");
		out.println("</div>");

		out.println("<div class='col-md-2'>");
		out.println("	<img src='http://cs3.calstatela.edu:8080/cs320stu43/lab3/images/gaga.png' alt='Lady Gaga' class='img-circle img-responsive' />");
		out.println("	<input type='radio' name='image' value='gaga.png' />");
		out.println("</div>");

		out.println("<div class='col-md-2'>");
		out.println("	<img src='http://cs3.calstatela.edu:8080/cs320stu43/lab3/images/hermoine.png' alt='Hermoine G.' class='img-circle img-responsive''/>");
		out.println("	<input type='radio' name='image' value='hermoine.png' />");
		out.println("</div>");

		out.println("</div>");

		out.println("<div class='row text-center'>");
		out.println("<div class='col-md-offset-2 col-md-2'>");
		out.println("	<img src='http://cs3.calstatela.edu:8080/cs320stu43/lab3/images/mj.png' alt='Michael Jackson' class='img-circle img-responsive'/>");
		out.println("	<input type='radio' name='image' value='mj.png' />");
		out.println("</div>");

		out.println("<div class='col-md-2'>");
		out.println("	<img src='http://cs3.calstatela.edu:8080/cs320stu43/lab3/images/joker.png' alt='Joker' class='img-circle img-responsive'/>");
		out.println("	<input type='radio' name='image' value='joker.png' />");
		out.println("</div>");

		out.println("<div class='col-md-2'>");
		out.println("	<img src='http://cs3.calstatela.edu:8080/cs320stu43/lab3/images/sheldon.png' alt='Sheldon' class='img-circle img-responsive'/>");
		out.println("	<input type='radio' name='image' value='sheldon.png' />");
		out.println("</div>");

		out.println("<div class='col-md-2'>");
		out.println("	<img src='http://cs3.calstatela.edu:8080/cs320stu43/lab3/images/penny.png' alt='Penny' class='img-circle img-responsive' />");
		out.println("	<input type='radio' name='image' value='penny.png' />");
		out.println("</div>");

		out.println("</div>");

		out.println("<p class='text-center'> <input class='btn btn-primary' type='submit' value='Post' /></p>");
		out.println("</form>");

		out.println("</body></html>");
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String image = request.getParameter("image");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String message = request.getParameter("message");
		String imagex = "http://cs3.calstatela.edu:8080/cs320stu43/lab3/images/" + image;

		MessageBoardModel post = new MessageBoardModel(imagex, name, title,message);

		List<MessageBoardModel> posts = (List<MessageBoardModel>) getServletContext()
				.getAttribute("posts");
		posts.add(post);

		response.sendRedirect("MessageBoard");
	}

}