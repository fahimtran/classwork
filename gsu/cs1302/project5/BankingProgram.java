import javax.swing.JFrame;

/**
 * Banking Program
 *
 * @author Fahim Jeylani-Tran
 * @version 7/23/20
 */
public class BankingProgram {

    /**
     * Main method for testing SavingsAccount objects
     * @param args command line arguments (not used for this project)
     */
    public static void main(String[] args) {
        JFrame frame = new BankingFrame();
        frame.setTitle("Banking Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/**
 * 
 *
 * @author Fahim Jeylani-Tran
 * @version 7/23/20
 */
class BankingFrame extends JFrame {
    private BankAccount account;

    /**
     * Default constructor for BankingFrame
     */
    public BankingFrame() {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents() {
        withdrawalButton = new JButton("Withdraw");
        depositButton = new JButton("Deposit");
        amountTextField = new JTextField(FIELD_WIDTH);
        panel = ;
    }
}

/**
 * BankAccount class from previous project
 *
 * @author Fahim Jeylani-Tran
 * @version 7/23/20
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