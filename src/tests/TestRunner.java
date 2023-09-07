package tests;

/**
 * @author Owennn - osherrmann
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestBankAccLogic.class, TestBankAccount.class })
public class TestRunner {
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestBankAccLogic.class, TestBankAccount.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		// did all test cases pass?
		System.out.println("Result successful? " + result.wasSuccessful());
	}
}
