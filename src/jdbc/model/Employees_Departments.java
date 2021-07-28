package jdbc.model;


public class Employees_Departments {
	private int employee_id;
	private String first_name;
	private String job_id;
	private String email;
	private int salary;
	private int manager_id;
	private int department_id;
	private String department_name;

	
	public Employees_Departments(int employee_id, String first_name, String job_id, String email,
								int salary, int manager_id, int department_id, String department_name) {
		
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.job_id = job_id;
		this.email = email;
		this.salary = salary;
		this.manager_id = manager_id;
		this.department_id = department_id;
		this.department_name = department_name;
		
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public String getJob_id() {
		return job_id;
	}
	
	public String getEmail() {
		return email;
	}

	public int getSalary() {
		return salary;
	}
	
	public int getManager_id() {
		return manager_id;
	}

	public int getDepartment_id() {
		return department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}



	
	@Override
	public String toString() {
		return String.format("%d\t%d\t%s\t%s\t%s\t%s\t%d\t%d\n",
				employee_id,department_id,department_name,email,first_name,job_id,manager_id,salary);
	}
	
}
