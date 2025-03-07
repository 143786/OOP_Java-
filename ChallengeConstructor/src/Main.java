public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Tabish", 1000,
                "abdmalik@gmail.com");
        /* I've created a new object of type customer, and at the same
        time, passed data to the constructor: the name, the credit limit
        and the email. And then, I print out all three fields using the
        getters. */
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();

         System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());


        Customer thirdCustomer = new  Customer("Nil","nil@gmail.com");

         System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }
}