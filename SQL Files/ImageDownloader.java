package cs320.lab2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Lab2/ImageDownloader")
public class ImageDownloader extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		ServletOutputStream out = response.getOutputStream();

		String img = request.getParameter("image");

		if (request.getParameter("image") != null) {

			//String relativePath = getServletContext().getRealPath((new StringBuilder("http://cs3.calstatela.edu:8080/cs320stu72/Lab2/images/")).append(img).toString());

			File file = new File("http://cs3.calstatela.edu:8080/cs320stu72/Lab2/images/" + img );
			
			// C://Users/Jaymin/Downloads/cs320/images/
			// http://cs3.calstatela.edu:8080/cs320stu72/Lab2/images/
			
			try{
			FileInputStream in = new FileInputStream(file);
			byte buffer[] = new byte[4098];
			response.setContentType("image/png");
			response.setHeader("Content-Disposition", (new StringBuilder("attachment; filename="))
					.append(img).toString());

			for (int bytesRead = -1; (bytesRead = in.read(buffer)) != -1;)
				out.write(buffer, 0, bytesRead);
			in.close();
			out.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			
		} else {
			
			out.println("<!DOCTYPE html>");
			out.println("<head>");
			out.println("	<meta charset='UTF-8'>");
			out.println("	<title>Image Downloader</title>");
			out.println("	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'>");
			out.println("</head>");

			out.println("<body>");
			out.println("	<form action=\"ImageDownloader\" method=\"get\">");
			out.println("   <hr><h1>Image Downloader</h1><hr>");
			
			out.println("<ul>");
			out.println("	<li><a href='ImageDownloader?image=bean.png' name='image'> Mr. Bean </a></li> <br>");
			out.println("	<li><a href='ImageDownloader?image=gaga.png' name='image'> Lady Gaga </a></li> <br>");
			out.println("	<li><a href='ImageDownloader?image=hermoine.png' name='image'> Hermoine </a></li> <br>");
			out.println("	<li><a href='ImageDownloader?image=joker.png' name='image'> Joker </a></li> <br>");
			out.println("	<li><a href='ImageDownloader?image=mj.png' name='image'> Micheal Jackson </a></li> <br>");
			out.println("	<li><a href='ImageDownloader?image=penny.png' name='image'> Penny </a></li> <br>");
			out.println("	<li><a href='ImageDownloader?image=sheldon.png' name='image'> Sheldon </a></li> <br>");
			out.println("	<li><a href='ImageDownloader?image=steve.png' name='image'> Steve </a></li> <br>");
			out.println("	<li><a href='ImageDownloader?image=clint.png' name='image'> Clint </a></li> <br>");
			out.println("</ul>");
			out.println("<hr>");

			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
		}

	}
}