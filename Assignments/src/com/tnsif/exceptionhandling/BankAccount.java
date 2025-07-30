package com.tnsif.exceptionhandling;
import java.util.Scanner;
public class BankAccount {
	//instance variables
	private int accountNumber;
	private double balance;
	
	//default constructor	
	public BankAccount() {
	}
	
	//Parameterised constructor
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Method to deposit money, throws exception if amount is invalid
	public void deposit(double amount) throws InvalidAmountException{
		if(amount <= 0) {
			throw new InvalidAmountException("Amount of deposit must be greater than zero.");
		}
		this.balance+=amount;
		System.out.println("Deposited "+amount+" rs. successfully.");
	}
	
	// Method to withdraw money, throws exception if balance is insufficient
	public double withdraw(double amount) throws InsufficientFundsException{
		if(amount > balance) {
			throw new InsufficientFundsException("Insufficient balance");
		}
		this.balance -= amount;
		return balance;
	}
	
	//for showing balance 
	public double getBalance() {
		return balance;
	}

	//Set balance value
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    BankAccount user1 = new BankAccount(12345, 200000);

	    int choice;

	    while (true) {
	        System.out.println("\n====== Banking Menu ======");
	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        System.out.println("4. Exit");
	        System.out.print("Enter your choice: ");
	        choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("Current Balance: ₹" + user1.getBalance());
	                break;

	            case 2:
	                System.out.print("Enter amount to deposit: ₹");
	                double depositAmount = sc.nextDouble();
	                try {
	                    user1.deposit(depositAmount);
	                    System.out.println("Balance After Deposit: ₹" + user1.getBalance());
	                } catch (InvalidAmountException e) {
	                    System.err.println("Deposit failed: " + e.getMessage());
	                }finally {
						System.out.println("Deposit operation attempted.");
					}
	                break;

	            case 3:
	                System.out.print("Enter amount to withdraw: ₹");
	                double withdrawAmount = sc.nextDouble();
	                try {
	                    user1.withdraw(withdrawAmount);
	                    System.out.println("Balance After Withdrawal: ₹" + user1.getBalance());
	                } catch (InsufficientFundsException e) {
	                    System.err.println("Withdrawal failed: " + e.getMessage());
	                }finally {
						System.out.println("Withdrawal operation attempted.");
					}
	                break;

	            case 4:
	                System.out.println("Thank you for using the banking system. Goodbye!");
	                sc.close();
	                System.exit(0);

	            default:
	                System.out.println("Invalid choice. Please enter 1-4.");
	        }
	    }
	}


}
