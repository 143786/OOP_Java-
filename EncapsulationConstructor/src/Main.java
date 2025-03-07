public class Main {
        public static void main(String[] args) {

//           Account bobsAccount = new Account("12345", 500,
//                   "Bob Brown", "myemail@bob.com",
//                   "07-66-88-65");
            Account bobsAccount = new Account();

            System.out.println(bobsAccount.getNumber());
            System.out.println(bobsAccount.getBalance());

//            bobsAccount.setNumber("12345");
//            bobsAccount.setBalance(1000.00);
//            bobsAccount.setCustomerName("Bob Brown");
//            bobsAccount.setCustomerEmail("myemail@bob.com");
//            bobsAccount.setCustomerPhone("07-66-88-65");


            bobsAccount.withdrawFunds(100.0);
            bobsAccount.depositFunds(250);
            bobsAccount.withdrawFunds(1000);
            bobsAccount.withdrawFunds(190);

            Account tabishAccount = new Account("Tabish",
                    "abdtabish@gmail.com", "123455678");
            System.out.println("AccountNo " + tabishAccount.getNumber() +
                    "; name " + tabishAccount.getCustomerName());

        }
    }


    /*
                Constructor
         The purpose of the constructor is to essentially
         initialize the object that I'm creating and do whatever
         else I need  to do while the object is being instantiated
         It's only ever called once, at the start, when I'm creating
         the object.

         A Class can have one or many constructors, one of which
         can be a no args constructor. So now, I'll add another
         constructor, and this time I'll declare some parameters.

         Doing this will let me pass values to the constructor.
         I can then use these values to assign data to my fields
         instead of calling a whole bunch of setters.

         ****  So having multiple constructor as I have done  here (2 constructor)
         is called constructor overloading. it looks a lot like method overloading,

         Constructor overloading :  is declaring multiple constructors with
         different parameters.
         THe number of parameters can be different between constructors.

         Or if the number of parameters is the same between two constructors, their
         types, or order of the types must differ.

     */
