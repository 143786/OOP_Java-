public class Main {
    public static void main(String[] args) {

        Acount bobsAcount = new Acount();

        bobsAcount.setNumber("12345");
        bobsAcount.setBalance(1000.00);
        bobsAcount.setCustomerName("Bob Brown");
        bobsAcount.setCustomerEmail("myemail@bob.com");
        bobsAcount.setCustomerPhone("07-66-88-65");


        bobsAcount.withdrawFunds(100.0);
        bobsAcount.depositFunds(250);
        bobsAcount.withdrawFunds(1000);
        bobsAcount.withdrawFunds(190);

    }
}
