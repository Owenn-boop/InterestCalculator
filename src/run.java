/**
 * @author Owennn - osherrmann
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */

import java.util.Scanner;

import model.BankAccLogic;
import model.BankAccount;

/**
 * Basic interest rate calculator.
 * Run this file to calculate your estimated interest.
 * 
 * Run test cases in /src/tests/TestRunner.java
 */
public class run {
	
	public static void main(String[] args) {
		askCredentials();
	}
	
	public static void askCredentials() {
		String userName;
		Double balance, interestRate;
		BankAccLogic bankLogic = new BankAccLogic();
		Scanner scan = new Scanner(System.in);
		
		// asks the user for the needed information
		System.out.print("Hello! What is your name? ");
		userName = scan.nextLine();
		
		System.out.println("Hi " + userName + "!");
		System.out.print("What is your account balance? ");
		balance = scan.nextDouble();
		
		System.out.print("What is the interest rate (as a percentage) of your account? ");
		interestRate = scan.nextDouble();
		
		BankAccount bank = new BankAccount(userName, balance, interestRate);
		
		// results
		System.out.println("-----------------------------");
		System.out.println(bankLogic.printBankAccount(bank));
		System.out.println("Your yearly interest is: " + bankLogic.calculateYearlyInterest(bank));
		System.out.println("Your monthly interest is: " + bankLogic.calculateMonthlyInterest(bank));
		System.out.println("-----------------------------");
		System.out.print("Would you like to simulate interest again? (y or n) ");
		String yOrN = scan.next();
		if(yOrN.contentEquals("y")  || yOrN.contentEquals("Y")) {
			askCredentials();
		}
	}

}
