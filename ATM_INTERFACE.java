import java.util.Scanner;

class BankAccount {

  // How much money the account holds
  private double balance;

  public BankAccount(double initialBalance) {
    // Set the starting amount in the account
    this.balance = initialBalance;
  }

  // Tell the user how much money they have
  public double getBalance() {
    return balance;
  }

  // Add money to the account (deposit)
  public void deposit(double amount) {
    // Make sure the amount isn't negative (can't deposit debt!)
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit successful! Your new balance is: Rs. " + balance);
    } else {
      System.out.println("Oops! Can't deposit negative amounts. Try again.");
    }
  }

  // Take money out of the account (withdrawal)
  public boolean withdraw(double amount) {
    // Check if they have enough money and the amount isn't negative
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawal successful! Take your cash: Rs. " + amount);
      return true; // Successful withdrawal
    } else {
      System.out.println("Sorry, not enough funds or invalid amount. Try again.");
      return false; // Unsuccessful withdrawal
    }
  }
}

class ATM {

  // The bank account linked to this ATM
  private BankAccount account;

  public ATM(BankAccount account) {
    this.account = account;
  }

  // Show the user their options
  public void displayMenu() {
    System.out.println("Welcome to your friendly neighborhood ATM!");
    System.out.println("What can I do for you today?");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Cash");
    System.out.println("3. Withdraw Cash");
    System.out.println("4. Exit");
  }

  // Handle user interaction with the ATM
  public void run() {
    Scanner scanner = new Scanner(System.in);
    int choice;
    double amount;

    while (true) {
      displayMenu();
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          // Show the user their balance
          System.out.println("Your current balance is: Rs. " + account.getBalance());
          break;
        case 2:
          // Take a deposit
          System.out.print("Enter the amount you'd like to deposit: Rs. ");
          amount = scanner.nextDouble();
          account.deposit(amount);
          break;
        case 3:
          // Let the user withdraw money
          System.out.print("Enter the amount you'd like to withdraw: Rs. ");
          amount = scanner.nextDouble();
          account.withdraw(amount);
          break;
        case 4:
          // Say goodbye!
          System.out.println("Thank you for using the ATM. Have a great day!");
          return;
        default:
          // Invalid choice, tell them to try again
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }
}

public class ATM_INTERFACE {

  public static void main(String[] args) {
    // Create a bank account with some starting money
    BankAccount userAccount = new BankAccount(100000);

    // Create an ATM linked to that account
    ATM atm = new ATM(userAccount);

    // Start the ATM and let the user interact with it
    atm.run();
  }
}