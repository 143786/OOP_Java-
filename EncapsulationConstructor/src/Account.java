public class Account {

        private String number;
        private double balance;
        private String  customerName;
        private String  customerEmail;
        private String customerPhone;

        public Account() {
            // Constructor without parameters (default const)
            this("45768", 2.50, "Default name",
                    "Default address","Default phone" );
            // this calling another const
            System.out.println("Empty constructor called");
        }
        public Account(String number, double balance, String customerName,
                       String email, String phone) { // constructor with parameters
            System.out.println("Account constructor with parameters called ");
            this.number = number;
            this.balance = balance;
            this.customerName = customerName;
            customerEmail = email;
            customerPhone = phone;
        }

    public Account(String customerName, String customerEmail, String customerPhone) { //
            //  The third constructor with 3 parameters
        this("9999", 100.55, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {

            balance+= depositAmount;
            System.out.println("Deposit of $" + depositAmount + " made. New balance is $" +
                    balance);
        }

        public void withdrawFunds(double withdrawlAmount) {
            if (balance - withdrawlAmount < 0) {
                System.out.println("Insufficient Funds! You only have $" + balance  +
                        " in your account.");
            } else  {
                balance -= withdrawlAmount;
                System.out.println("withdrawal of $" + withdrawlAmount +
                        " processed, Remining balance = $" + balance );

            }

        }
        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerEmail() {
            return customerEmail;
        }

        public void setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
        }

        public String getCustomerPhone() {
            return customerPhone;
        }

        public void setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
        }
    }


       /*         constructor chaining :
            calling one constructor from another constructor.

        */
