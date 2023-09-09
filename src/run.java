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
	
	public static double promptPositiveDouble(Scanner scan, String message) {
		Double num = null;
		while(num == null) {
			try {
				System.out.print(message);
				num = scan.nextDouble();
				
				// if the number is negative, prompt for a new number
				if(num < 0) {
					System.out.println("Must be a possitive number,");
					num = null;
				}
			}
			catch(Exception e) {
				
				// received a non-number string
				System.out.println("Must be a number.");
				scan.next();
			}
		}
		return num;
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
		balance = promptPositiveDouble(scan, "What is your account balance? ");
		
		interestRate = promptPositiveDouble(scan, "What is the interest rate (as a percentage) of your account? ");
		
		BankAccount bank = new BankAccount(userName, balance, interestRate);
		
		// results
		System.out.println("-----------------------------");
		System.out.println(bankLogic.printBankAccount(bank));
		System.out.println("Your yearly interest is: $" + bankLogic.calculateYearlyInterest(bank));
		System.out.println("Your monthly interest is: $" + bankLogic.calculateMonthlyInterest(bank));
		System.out.println("-----------------------------");
		
		// prompt user to input "y" if they would like to simulate interest again
		System.out.print("Would you like to simulate interest again? (y or n) ");
		String yOrN = scan.next();
		if(yOrN.contentEquals("y")  || yOrN.contentEquals("Y")) {
			askCredentials();
		}
	}

}


/*
Hello! What is your name? Owenn Herrmann
Hi Owenn Herrmann!
What is your account balance? 50
What is the interest rate (as a percentage) of your account? 1

Expected result is: 50 cents a year
Actual result is: 50 cents a year ($0.5)

*/