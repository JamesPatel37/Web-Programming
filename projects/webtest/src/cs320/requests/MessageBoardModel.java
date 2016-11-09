package cs320.requests;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/MessageBoardModel")
public class MessageBoardModel extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String name;
	String title;
	String message;
	String img;

	public MessageBoardModel(String img, String name, String title,
			String message) {
		this.img = img;
		this.name = name;
		this.title = title;
		this.message = message;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
