package intlbank;

public class CheckingAccount extends Account {

	public CheckingAccount(int branch, int accNumber) {
		super(branch, accNumber);
	}
	
	@Override
	public boolean withdrawal(double amount) {
		double withdrawalAmount = amount + 0.2;
		return super.withdrawal(withdrawalAmount);
	}
	
	

}
