package cs320.GuestBook;

import java.util.Date;

public class GuestBookPost {

	String name;
	String message;
	Date datePosted;
	
	public GuestBookPost(String name, String message) {
		super();
		this.name = name;
		this.message = message;
		this.datePosted = new Date();
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}

	public Date getDatePosted() {
		return datePosted;
	}
	
	
	
	
	
	
}
