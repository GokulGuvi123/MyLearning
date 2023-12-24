package ProductPackage;

public class Product {
	public int pid;
	public double price;
	public double quantity;

	public Product(int pid, double price, double quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	public Product() {
	}

	public int findHigeshPricePid(Product[] products) {
		double higestPrice = 0;
		int highestPid= 0;
		for (Product product : products) {
			if (product.price > higestPrice) {
				higestPrice = product.price;
				highestPid = product.pid;
			}
		}
		return highestPid;
	}

}
