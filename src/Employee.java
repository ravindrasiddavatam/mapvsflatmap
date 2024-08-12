import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private List<String>citiesWorkedIn;
	
	public Employee(int id, String name, List<String> citiesWorkedIn) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.citiesWorkedIn=citiesWorkedIn;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public List<String> getcities(){
		return citiesWorkedIn;
	}
	public void setCities(List<String> citiesWorkedIn) {
		this.citiesWorkedIn=citiesWorkedIn;
	}
	
	public String toString() {
		return "Employee [id="+ id +", name=" + name +", citiesWorkedIn="+ citiesWorkedIn +"]";
	}
	

}
