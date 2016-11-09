package Midterm;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/Model")
public class Model extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public String make;
	public String model;
	public Integer year;
	public int id;
	
	public Model(String make, String model, Integer year) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.id= numberOfCars++;
	}
	
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}
	

}
