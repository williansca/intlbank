package intlbank;

public abstract class Account {

	private int accNumber;
	private double balance;
	private int branch;
	private Customer customer;
	private static int totalAcc = 0;

//	public Account() {
//
//	}

	public Account(int branch, int accNumber) {
		totalAcc++;
		this.accNumber = accNumber;
		this.branch = branch;

	}

	public void deposit(double amount) {
		System.out.println("Deposit of " + amount + " to account " + this.accNumber);
		this.balance += amount;
	}

	public boolean withdrawal(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			return true;
		}
		System.out.println("Invalid amount");
		return false;
	}

	public boolean transfer(double amount, Account accTo) {
		this.withdrawal(amount);
		accTo.deposit(amount);
		return true;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccountNumber(int accNumber) {
		if (accNumber <= 0) {
			System.out.println("Number equals or below zero not allowed");
			return;
		}
		this.accNumber = accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		if (branch <= 0) {
			System.out.println("Invalid branch number");
			return;
		}
		this.branch = branch;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public static int getTotalAcc() {
		return Account.totalAcc;
	}

}
