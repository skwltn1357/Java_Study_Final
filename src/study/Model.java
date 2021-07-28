package study;

public class Model {
	String first_name;
	String department_name;
	String city;
	
	public Model(String first_name, String department_name, String city) {
		this.first_name = first_name;
		this.department_name = department_name;
		this.city = city;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\n", first_name,department_name,city);
	}
}
