/**
 * Public Visible Driver Class called InteritanceTester
 *
 * @author Fahim Jeylani-Tran
 * @version 7/5/20
 */
public class InheritanceTester {
   /**
    * Main method for testing SavingsAccount objects
    * @param args command line arguments (not used for this project)
    */
   public static void main(String[] args) {
      // Spacing for command line
      System.out.println();

      // Default Tests
      SavingsAccount tom = new SavingsAccount(5000);
      SavingsAccount kim = new SavingsAccount();

      tom.withdraw(100);
      tom.withdraw(1000);
      tom.withdraw(200);

      kim.withdraw(100); //should print error message: Insufficient balance
      System.out.println(tom); //should print $3700 as balance

      tom.withdraw(1000);
      System.out.println(tom); //should print $2690 as balance, and fee charged

      tom.withdraw(1000);
      System.out.println(tom); //should print $1690 as balance

      // Testing Comparable
      System.out.println(tom.compareTo(kim)); // should print  1
      System.out.println(tom.compareTo(tom)); // should print  0
      System.out.println(kim.compareTo(tom)); // should print -1
   }
}

/**
 * Implementing on top of default BankAccount class
 *
 * @author Fahim Jeylani-Tran
 * @version 7/5/20
 */
class BankAccount {
   private double balance;

   /**
    * Default constructor for BankAccount object
    */
   public BankAccount() {
      balance = 0;
   }

   /**
    * Custom constructor that takes in a double, initialBalance
    * @param initialBalance initial balance of bank account
    */
   public BankAccount(double initialBalance) {
      balance = initialBalance;
   }
   
   /**
    * Mutator method for balance that increases it
    * @param amount amount to increase balance by
    */
   public void deposit(double amount) {
      balance = balance + amount;
   }

   /**
    * Mutator method for balance that decreases it
    * @param amount amount to decrease balance by
    */
   public void withdraw(double amount) {
      balance = balance - amount;
   }

   /**
    * Accessor method to retrieve current balance
    * @return balance in the form of a double/decimal
    */
   public double getBalance() {
      return balance;
   }

   /**
    * Overridden toString method to display useful information
    * @return String representation of current balance
    */
   @Override
   public String toString() {
      return String.format("Balance: $%,10.2f%n", balance);
   }
}

/**
 * Implementing a SavingsAccount class that extends BankAccount
 *
 * @author Fahim Jeylani-Tran
 * @version 7/5/20
 */
class SavingsAccount extends BankAccount implements Comparable<SavingsAccount> {
   // Instance fields and a constant for Fees
   private int withdrawalCount;
   private int feeCount;
   private final static double WITHDRAWAL_FEE = 10.0;

   /**
    * Default constructor for SavingsAccount object
    */
   public SavingsAccount() {
      super();
      withdrawalCount = 0;
   }

   /**
    * Custom constructor that takes in a double, initialBalance
    * @param initialBalance initial balance of bank account
    */
   public SavingsAccount(double initialBalance) {
      super(initialBalance);
      withdrawalCount = 0;
   }

   public void deposit(double amount) {
      super.deposit(amount);
   }

   /**
    * Mutator method for balance that decreases it, does validation, and incurs fees
    * @param amount amount to decrease balance by
    */
   @Override
   public void withdraw(double amount) {
      // Checks if balance is sufficient enough
      if (amount <= super.getBalance()) {
         if (withdrawalCount == 3) {
            // Immediate fee incursion after three free withdrawals
            feeCount++;
            super.withdraw(WITHDRAWAL_FEE);
            // Reset count for easy counting
            withdrawalCount = 0;
            if (amount <= super.getBalance()) {
               super.withdraw(amount);
               withdrawalCount++;
            } else {
               // Error message
               System.out.println("ERROR: Insufficient Balance.\n");
            }
         } else {
            super.withdraw(amount);
            withdrawalCount++;
         }
      } else {
         // Error message
         System.out.println("ERROR: Insufficient Balance.\n");
      }
   }

   /**
    * Implemented Comparable Interface's abstract method
    * @param account compares this SavingsAccount object's balance to another SavingsAccount object
    */
   @Override
   public int compareTo(SavingsAccount account) {
      // if current account is greater, print 1, if equal, print 0, if less, print -1
      if (this.getBalance() == account.getBalance()) {
         return 0;
      } else if (this.getBalance() > account.getBalance()) {
         return 1;
      } else {
         return -1;
      }
   }

   /**
    * Overridden toString method to display useful information
    * @return String representation of current balance and fees incurred, if any
    */
   @Override
   public String toString() {
      return super.toString() + 
         (feeCount >= 1 ? String.format("Fees incurred: $%,6.2f%n", (feeCount * 10.0)) : "");
   }
}
