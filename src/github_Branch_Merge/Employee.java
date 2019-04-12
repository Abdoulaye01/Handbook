package github_Branch_Merge;

public class Employee {

	int employee_id;  
	String employee_name;  
	float employee_salary;
	
public void insert(int employee_id, String employee_name, float employee_salary) {  
		this.employee_id = employee_id;  
		this.employee_name = employee_name;  
		this.employee_salary = employee_salary;  
}
	
public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public float getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(float employee_salary) {
		this.employee_salary = employee_salary;
	}
  


public void display(){
	System.out.println("Employee [employee_id = " + employee_id + ", employee_name = " + 
employee_name + ", employee_salary = " + employee_salary + "]");
}  
}  


