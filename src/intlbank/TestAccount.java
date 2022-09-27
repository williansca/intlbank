package intlbank;

public class TestAccount {

	public static void main(String[] args) {

		Account acc = new Account(01, 1111);
		System.out.println(String.format("Initial balance: " + "%.2f", acc.getBalance()));
		acc.deposit(100.0);
		System.out.println(String.format("%.2f", acc.getBalance()));
		
		Account acc2 = new Account(02, 2222);
		System.out.println(String.format("Initial balance: " + "%.2f", acc2.getBalance()));
		acc2.deposit(500.0);
		System.out.println(String.format("%.2f", acc2.getBalance()));
		
		acc2.withdrawl(200.0);
		System.out.println(String.format("%.2f", acc2.getBalance()));
		
		System.out.println("Total accounts: " + Account.getTotalAcc());
	}

}
