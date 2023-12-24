package Person_Employee_Inheritance;

public class EmployeeDetail {
	public static void main(String[] args) {
		Employee E1 = new Employee("Ankit", 23, 101, 25000);
		System.out.println("Name: " + E1.name);
		System.out.println("Age: " + E1.age);
		System.out.println("EmployeeID : " + E1.EmployeeId);
		System.out.println("Salary : " + E1.salary);
	}

}
