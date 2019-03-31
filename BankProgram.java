
// ************************************************************************
// BankProgram.java	 Template created on 15.9.2016
// - The program class for the BankApplication exercise
// ************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BankProgram {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Account> accountList = new ArrayList<Account>();
	private static DecimalFormat twoDecimal = new DecimalFormat("0.00");

	// *** DO NOT change anything in the main method ***
	public static void main(String[] args) {
		int choice = -1;

		while (choice != 0) {

			switch (choice) {
			case 1:
				listAccounts();
				break;
			case 2:
				addAccount();
				break;
			case 3:
				depositMoney();
				break;
			case 4:
				withdrawMoney();
				break;
			case 5:
				deleteAccount();
				break;
			}

			displayMenu();
			choice = Integer.parseInt(input.nextLine());
		}

		System.out.println("\nThe program ends now. Bye!");
		input.close();
	}

	private static void displayMenu() {
		String line = "-----------------------------------------------------"
				+ "---------------------------------------------------------------";
		System.out.println(line);
		System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | "
				+ "3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
		System.out.println(line);
		System.out.print("Enter your choice: ");
	}

	// *** NB! Edit only the methods below. DO NOT add any other methods! ***

	private static void listAccounts() {
		System.out.print("\n*** Account list ***\n");
		for (int i = 0; i < accountList.size(); i++) {
			System.out.println("Number: " + accountList.get(i).getAccountNumber() + "| Balance: "
					+ twoDecimal.format(accountList.get(i).getBalance()).replace(".", ",") + " euros");
		}
	}

	private static void addAccount() {
		System.out.print("\n*** Add an account ***\n");
		System.out.print("Enter account number: ");
		String accountInput = input.nextLine();
		int IsExist = 0;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountInput)) {
				IsExist++;
			}
		}
		if (IsExist == 0) {
			accountList.add(new Account(accountInput));
			System.out.println("\n\nAccount created successfully!");
		} else {
			System.out.println("\n\nAccount not created. Account " + accountInput + " exists already!");

		}
	}

	// Finds an account in accountList by given account number.
	// Returns either a reference to the account object
	// OR null if the account is not found in accountList.
	private static Account findAccount(String accountNumber) {
		Account myAccount = null;

		return myAccount;
	}

	private static void depositMoney() {
		System.out.print("\n*** Deposit money to an account ***\n");
		System.out.print("Enter account number: ");
		String accountInput = input.nextLine();
		int index = -1;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountInput)) {
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("\n\nAccount " + accountInput + " does not exist!");
		} else {
			System.out.print("Enter the amount to be deposited: ");
			Double deposit = Double.parseDouble(input.nextLine());
			if (deposit < 0) {
				System.out.println("\n\nCannot deposit a negative amount!");
			} else {
				accountList.get(index).deposit(deposit);
				System.out.println("\n\nDeposit completed successfully!");
			}
		}

	}

	private static boolean withdrawMoney() {
		System.out.println("\n*** Withdraw money from an account ***\n");
		System.out.println("Enter account number: ");
		String accountInput = input.nextLine();

		int index = -1;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountInput)) {
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("\n\nAccount " + accountInput + " does not exist!");
			return false;
		} else {
			System.out.println("Enter the amount to be withdrawn: ");
			double withdrawAmount = Double.parseDouble(input.nextLine());
			if (withdrawAmount < 0) {
				System.out.println("\n\nCannot withdraw a negative amount!");
				return false;
			} else {
				if (accountList.get(index).withdraw(withdrawAmount) == false) {
					System.out.println("\n\nWithdrawal not completed. Available balance is too low.");
					return false;
				} else {

					System.out.println("\n\nWithdrawal completed successfully!");
					return true;
				}
			}
		}

	}

	private static void deleteAccount() {
		System.out.print("\n*** Delete an account ***\n");
		System.out.print("Enter account number: ");
		String accountInput = input.nextLine();
		int index = -1;
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNumber().equals(accountInput)) {
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("\n\nNothing deleted. Account " + accountInput + " does not exist!");
		} else {
			accountList.remove(index);
			System.out.println("\n\nAccount deleted successfully!");
		}
	}
}
// End

//************************************************************************
//Account.java	  Template created on15.9.2016
//- The class for Account objects
//************************************************************************

public class Account {
	// Fields
private String accountNumber;
private double balance;
	// Constructor
public Account(String accountNumber) {
	super();
	this.accountNumber = accountNumber;
	balance = 0.00;
}
	// Methods
public void deposit(double amount) {
	balance  += amount;
}
public String getAccountNumber() {
	return accountNumber;
}
public double getBalance() {
	return balance;
}
public boolean withdraw(double amount) {
	if((balance-amount)>0) {
		balance -=amount;
		return true;
	}
	else {
		return false;
	}
}
}
//End
