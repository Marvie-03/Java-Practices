//Account.java
//creating abstract class Account contains the essential elements
//of the concrete classes Current and Savings Accounts
public abstract class Account {
    private String firstName; // variable to store the first name of the owner of the account
    private String lastName; // variable to store the last name of the owner of the account
    private String address; // variable to store the address of the owner of the account
    private int accNo; // variable to store the account number of the owner of the account
    private double accBalance; // variable to store the account balance of the owner of the account
    // constructor to initialize the variables and create account

    public Account(String first, String last, String address1, int accNo1, double accBalance1) {
        firstName = first;
        lastName = last;
        address = address1;
        accNo = accNo1;
        accBalance = accBalance1;
    }

    // method to set the first name
    public void setFirstName(String first) {
        firstName = first;
    }

    // method to return first name
    public String getFirstName() {
        return firstName;
    }

    // method to set last name
    public void setLastName(String last) {
        lastName = last;
    }

    // method to return last name
    public String getLastName() {
        return lastName;
    }

    // method to set address
    public void setAddress(String address1) {
        address = address1;
    }

    // method to return address
    public String getAddress() {
        return address;
    }

    // method to set account number
    public void setAccNo(int accNo1) {
        accNo = accNo1;
    }

    // method to return account number
    public int getAccNo() {
        return accNo;
    }

    // method to set Account balance
    public void setAccBalance(double balancedoubleaccBalance1) {
        accBalance = balancedoubleaccBalance1;
    }

    // method to return Account balance
    public double getAccBalance() {
        return accBalance;
    }

    // method to make deposit
    public void deposit(double amount) {
        double balance;
        balance = getAccBalance(); // call to obtain the balance before deposit
        balance += amount; // adds deposit amount to old balance
        setAccBalance(balance); // sets the account balance to include deposit
        System.out.printf("\n\ndeposit successful, %s %s your new balance is %.2f NAIRA ",
                getFirstName(), getLastName(), balance); // display the new balance
    }

    public String displayBalance() {
        return String.format("%s %s your account balance is %.2f NAIRA", getFirstName(),
                getLastName(), getAccBalance());
    }

    public abstract void withdrawal(double amount);
}
