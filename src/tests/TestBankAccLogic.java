package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BankAccLogic;
import model.BankAccount;

public class TestBankAccLogic {

	BankAccount bankAcc = new BankAccount();
	BankAccLogic bankLogic = new BankAccLogic();
	@Before
	public void setUp() throws Exception {
	}

	// testing if monthly interest is accurate
	@Test
	public void testMonthlyInterest1() {
		bankAcc.setBalance(1000);
		bankAcc.setInterestRate(0.5);
		assertEquals(0.42, bankLogic.calculateMonthlyInterest(bankAcc), 0); // (1000*0.005)/12
	}
	
	@Test
	public void testMonthlyInterest2() {
		bankAcc.setBalance(5000);
		bankAcc.setInterestRate(1);
		assertEquals(4.17, bankLogic.calculateMonthlyInterest(bankAcc), 0); // (5000*0.01)/12
	}
	
	// testing if yearly interest is accurate
	@Test
	public void testYearlyInterest() {
		bankAcc.setBalance(1000);
		bankAcc.setInterestRate(0.5);
		assertEquals(5, bankLogic.calculateYearlyInterest(bankAcc), 0); // (1000*0.005)
	}
	
	// testing if bank account information is being printed correctly
	@Test
	public void testPrintBankAccount() {
		bankAcc.setAccountHolder("Owenn Herrmann");
		bankAcc.setBalance(1000);
		bankAcc.setInterestRate(0.45);
		assertEquals("Account Holder: Owenn Herrmann Balance: $1000.0 Interest Rate: 0.45%", bankLogic.printBankAccount(bankAcc));
	}
	
	// testing the rounding method of BankAccLogic
	@Test
	public void testRoundTwoDecimal() {
		assertEquals(0.5, bankLogic.roundTwoDecimal(0.5), 0);
	}
	
	@Test
	public void testRoundTwoDecimal2() {
		assertEquals(100.59, bankLogic.roundTwoDecimal(100.589), 0);
	}
}
