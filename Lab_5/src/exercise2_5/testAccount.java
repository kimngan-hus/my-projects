package exercise2_5;

public class testAccount {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck",'m');
        System.out.println(c1);  // Customer's toString()


        System.out.println(c1);
        System.out.println("id is: " + c1.getID());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getGender());

        // Test Invoice class
        Account account = new Account(99,c1,99.99);
        System.out.println(account);


        double amount = 88.88;
        System.out.println("id is: " + account.getId());
        System.out.println("customer is: " + account.getCustomer());
        System.out.println("customer's name is: " + account.getCustomerName());
        System.out.println("customer's deposit is: " + account.deposit(amount));
        System.out.printf("withdraw is: %.2f%n" , account.withdraw(amount));
    }
}
