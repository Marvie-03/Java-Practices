//CorporateCurrentAccount.java
//creating the concrete class, CorporateCurrent account, which is a subclass of CurrentAccount
public class CorporateCurrentAccount extends CurrentAccount {
    // constructor to initialize variables
    public CorporateCurrentAccount(String first, String last, String address1, int accNo1, double accBalance1,
            String accType1) {
        // explicit call to super class constructor
        super(first, last, address1, accNo1, accBalance1, accType1);
    }

    // method to perform overdraft for Corporate current account
    @Override
    public void overDraft(double amount) {
        double balance = getAccBalance();
        double newBalance = balance - amount - 1000; // calculate new balance deducting, withdrawn amount and 1000 Naira
                                                     // charge
        setAccBalance(newBalance);
    }

    @Override
    // method to effect cash withdrawal and override abstract method withdrawal in
    // super class
    public void withdrawal(double amount) {
        double availableBalance;
        availableBalance = getAccBalance();
        if ((availableBalance - amount) < 0) {
            overDraft(amount);
            System.out.printf(
                    "\n\n%s %s you have withdraw more than your available balance and you will be charged 1000.00 NAIRA per day for overdraft services. \nHere is your cash. Your new balance is %.2f NAIRA",
                    getFirstName(), getLastName(),
                    getAccBalance());
        } else {
            setAccBalance((availableBalance - amount));
            System.out.printf("\nHere's your cash. Your new balance is %.2f NAIRA", getAccBalance());
        }
    }
}