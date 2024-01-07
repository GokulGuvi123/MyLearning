package TaxManagement;

public class Product implements Taxable {
	int pId;
	double pPrice;
	double pQuantity;
    
	public Product(int pId, double pPrice, double pQuantity) {
		super();
		this.pId = pId;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
	}

	@Override
	public double calcTax() {
		double salexTax1 = (this.pPrice * this.pQuantity ) * (salesTax/100); // To calculate unit price of the product
		return salexTax1;
	}

}
