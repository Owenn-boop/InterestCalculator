package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BankAccount;

public class TestBankAccount {

	BankAccount bankAcc = new BankAccount();
	@Before
	public void setUp() throws Exception {
	}

	// tests if the account holder name can be changed and returns the changed value
	@Test
	public void testAccountHolderName() {
		String accountHolder = "Owenn Herrmann";
		bankAcc.setAccountHolder(accountHolder);
		assertTrue(accountHolder.equals(bankAcc.getAccountHolder()));
	}
	
	// tests if the account holder name is null by default
	@Test
	public void testAccountHolderNameNull() {
		assertNull(bankAcc.getAccountHolder());
	}
	
	// tests if the account holder name is null after a change
	@Test
	public void testAccountHolderNameNotNull() {
		bankAcc.setAccountHolder("Bob Stevens");
		assertNotNull(bankAcc.getAccountHolder());
	}
	
	// tests if the account interest can be changed and returns the changed value
	@Test
	public void testAccountInterest() {
		double interest = 0.5;
		bankAcc.setInterestRate(interest);
		assertEquals(interest, bankAcc.getInterestRate(), 0);
	}
	
	// tests if the account balance can be changed and returns the changed value
	@Test
	public void testBalance() {
		bankAcc.setBalance(100000);
		assertEquals(100000, bankAcc.getBalance(), 0.0);
	}

}
