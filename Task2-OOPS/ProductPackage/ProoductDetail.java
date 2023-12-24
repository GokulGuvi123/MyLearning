package ProductPackage;

import java.util.Scanner;

public class ProoductDetail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Product[] products = new Product[5];
		//Accepting five product info from user
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the pid:");
			int pid = scanner.nextInt();
			System.out.println("Enter the price;");
			double price = scanner.nextDouble();
			System.out.println("Enter the Quantity");
			double quantity = scanner.nextDouble();
			//creating a object and storing product info in a array
			products[i] = new Product(pid,price,quantity);
		}
		int pidHigestPrice = products[0].findHigeshPricePid(products);
		System.out.println("Pid with highest price is: "+pidHigestPrice);
		
	    double totalAmount = CalculateTotalAmount(products);
	    System.out.println("Total Amount Spent on all products is :"+totalAmount);
	}

	private static double CalculateTotalAmount(Product[] products) {
		double totalAmount = 0;
		for(Product product : products) {
			totalAmount = totalAmount + (product.quantity * product.price);
		}
		return totalAmount;
	}
}
