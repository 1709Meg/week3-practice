public class InvoiceTest {
    public static void main(String[] args) {

        // Create a customer
        Customer c1 = new Customer(101, "Megan", 10);

        // Create an invoice
        Invoice invoice = new Invoice(1, c1, 250.00);

        // Test the methods
        System.out.println("Invoice ID: " + invoice.getID());

        System.out.println("Customer: " + invoice.getCustomer());

        System.out.println("Customer Name: " + invoice.getCustomerName());

        System.out.println("Amount: $" + invoice.getAmount());

        System.out.println("Amount After Discount: $" + invoice.getAmountAfterDiscount());

        // Change the amount
        invoice.setAmount(500.00);
        System.out.println("\nAfter changing amount:");
        System.out.println("Amount: $" + invoice.getAmount());
        System.out.println("Amount After Discount: $" + invoice.getAmountAfterDiscount());

        // Change the customer
        Customer c2 = new Customer(102, "John", 20);
        invoice.setCustomer(c2);

        System.out.println("\nAfter changing customer:");
        System.out.println("Customer: " + invoice.getCustomer());
        System.out.println("Customer Name: " + invoice.getCustomerName());
        System.out.println("Amount After Discount: $" + invoice.getAmountAfterDiscount());
    }
}