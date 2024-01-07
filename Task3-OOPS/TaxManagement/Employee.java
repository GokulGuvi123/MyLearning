package TaxManagement;

public class Employee implements Taxable {
	int empId;
	String empName;
	double empSalary;

	public Employee(int id, String name, double salary) {
		this.empId = id;
		this.empName = name;
		this.empSalary = salary;
	}

	@Override
	public double calcTax() {
		double incomeTax1 = this.empSalary * (incomeTax/100);
		return incomeTax1;
	}

}
