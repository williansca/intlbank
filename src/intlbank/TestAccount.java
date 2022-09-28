package intlbank;

public class TestAccount {

	public static void main(String[] args) {

		CheckingAccount acc = new CheckingAccount(01, 1111);
		System.out.println(String.format("Initial balance: " + "%.2f", acc.getBalance()));
		acc.deposit(100.0);
		System.out.println(String.format("%.2f", acc.getBalance()));
		
		SavingsAccount acc2 = new SavingsAccount(02, 2222);
		System.out.println(String.format("Initial balance: " + "%.2f", acc2.getBalance()));
		acc2.deposit(500.0);
		System.out.println(String.format("%.2f", acc2.getBalance()));
		
		acc2.withdrawal(200.0);
		System.out.println(String.format("%.2f", acc2.getBalance()));
		
		System.out.println("Total accounts: " + Account.getTotalAcc());
		
		acc.transfer(50.0, acc2);
		System.out.println(String.format("%.2f", acc.getBalance()));
		System.out.println(String.format("%.2f", acc2.getBalance()));
	}

}
