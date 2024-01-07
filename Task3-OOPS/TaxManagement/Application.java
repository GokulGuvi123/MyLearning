package TaxManagement;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Id :");
		int empId = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Employee Name :");
		String empName = scanner.nextLine();
		System.out.println("Enter Employee Salary :");
		double empSalary = scanner.nextDouble();
		
		Employee emp = new Employee(empId, empName , empSalary);
		double incomeTax = emp.calcTax();
		System.out.println("Income Tax is :"+incomeTax);
		
		System.out.println("Enter Product ID :");
	    int pId = scanner.nextInt();
	    System.out.println("Enter Product Price :");
	    double pPrice = scanner.nextDouble();
	    System.out.println("Enter Product Quantity :");
	    double pQuantity = scanner.nextDouble();
		
	    Product prod = new Product(pId , pPrice , pQuantity);
	    double salesTax = prod.calcTax();
	    System.out.println("Sales Tax is :"+salesTax);
	    scanner.close();
	}
}
