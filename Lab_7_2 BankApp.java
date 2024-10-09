public class BankApp {
    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccount account = new BankAccount("John Doe", "1234567890", 1000.0);

        // Display account information
        System.out.println(account);

        // Deposit money
        account.deposit(500.0);
        System.out.println("After depositing $500: ");
        System.out.println(account);

        // Withdraw money
        account.withdraw(300.0);
        System.out.println("After withdrawing $300: ");
        System.out.println(account);

        // Withdraw more than balance
        account.withdraw(1500.0);
    }
}
