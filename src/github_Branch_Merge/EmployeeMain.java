package github_Branch_Merge;

public class EmployeeMain {
public static void main(String[] args) {  
	Employee e1=new Employee();  
	Employee e2=new Employee(); 
	Employee e3=new Employee();
	
	
	e1.insert(101,"Sean",45000);  
	e2.insert(102,"John",25000);
	e3.insert(102,"lisa",25000);
	
	e1.display();  
	e2.display(); 
	e3.display();
	
} 

}
