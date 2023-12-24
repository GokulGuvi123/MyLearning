package Person_Employee_Inheritance;

public class Employee extends Person {
	protected int EmployeeId;
	protected int salary;

	public Employee(String name, int age, int EmployeeId, int salary) {
		super(name, age);
		this.EmployeeId = EmployeeId;
		this.salary = salary;
	}

}
