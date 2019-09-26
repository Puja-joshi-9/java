package inheritance;

public class Employee {
	
	int id;
	String fname;
	String lname;
	String company;
	int salary;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", company=" + company + ", salary="
				+ salary + "]";
	}
	
	

}
