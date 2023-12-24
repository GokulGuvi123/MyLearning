package AccountPackage;

public class Account {
	private double balance;

	public Account() {
		this.balance = 0.0;
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public void Depoist(int depoistAmount) {
		this.balance = this.balance + depoistAmount;
	}

	public void Withdraw(int withdrawAmount) {
		if (withdrawAmount > this.balance) {
			System.out.println("Sorry your current account balance is :" + this.balance);
		} else {
			this.balance = this.balance - withdrawAmount;
		}
	}

	public void DisplayBalance() {
		System.out.println(this.balance);
	}

}
