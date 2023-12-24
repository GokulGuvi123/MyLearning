package AccountPackage;

public class AccountDetail {

	public static void main(String[] args) {
		//Account 1 
		Account A1 = new Account(1000);
		A1.DisplayBalance();
		A1.Withdraw(800);
		A1.DisplayBalance();
		
		//Account 2 
		Account A2 = new Account();
		A2.Depoist(1200);
		A2.DisplayBalance();
		A2.Withdraw(1800);;
		A2.Withdraw(1200);
		A2.DisplayBalance();

	}

}
