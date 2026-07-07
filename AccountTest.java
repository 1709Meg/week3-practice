public class AccountTest {
    public static void main(String[] args) {

        // Create a customer
        Customer customer = new Customer(101, "Megan", 'f');

        // Create an account
        Account account = new Account(1, customer, 500.00);

        // Display account information
        System.out.println(account);

        // Test getters
        System.out.println("Account ID: " + account.getID());
        System.out.println("Customer: " + account.getCustomer());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Balance: $" + account.getBalance());

        // Deposit money
        account.deposit(250.00);
        System.out.println("\nAfter depositing $250:");
        System.out.println(account);

        // Withdraw money
        account.withdraw(100.00);
        System.out.println("\nAfter withdrawing $100:");
        System.out.println(account);

        // Attempt to withdraw too much
        account.withdraw(1000.00);
        System.out.println("\nAfter attempting to withdraw $1000:");
        System.out.println(account);

        // Set a new balance
        account.setBalance(750.00);
        System.out.println("\nAfter setting balance to $750:");
        System.out.println(account);
    }
}
