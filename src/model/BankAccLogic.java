package model;

public class BankAccLogic {

	// rounds to nearest cent
	public double roundTwoDecimal(double numberToRound) {
		return (double) Math.round(numberToRound * 100) / 100;
	}
	
	// calculates monthly interest to nearest cent
	public double calculateMonthlyInterest(BankAccount bankAcc) {
		double interest = this.calculateYearlyInterest(bankAcc) / 12;
		return roundTwoDecimal(interest);
	}
	
	// calculates yearly interest to nearest cent
	public double calculateYearlyInterest(BankAccount bankAcc) {
		double interest = bankAcc.getBalance() * (bankAcc.getInterestRate() / 100);
		return roundTwoDecimal(interest);
	}
	
	// returns info on bank account
	public String printBankAccount(BankAccount bankAcc) {
		return "Account Holder: " + bankAcc.getAccountHolder() + " Balance: " + bankAcc.getBalance() + " Interest Rate: " + bankAcc.getInterestRate();
	}
}
