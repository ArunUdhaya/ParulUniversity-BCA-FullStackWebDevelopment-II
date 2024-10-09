import java.io.Serializable;

// Java Bean for Bank Account
public class BankAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // No-argument constructor
    public BankAccount() {}

    // Constructor with parameters
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter and Setter methods

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit amount should be positive");
        }
    }

    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account Holder Name: " + accountHolderName + 
               "\nAccount Number: " + accountNumber + 
               "\nBalance: " + balance;
    }
}
