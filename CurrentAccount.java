//CurrentAccount.java
//creating the concrete class, current account, which is a subclass of Account
public class CurrentAccount extends Account {
    private String accType; // additional variable to store account type
    // constructor to initialize variables

    public CurrentAccount(String first, String last, String address1, int accNo1, double accBalance1, String accType1) {
        // explicit call to super class constructor
        super(first, last, address1, accNo1, accBalance1);
        accType = accType1;
        setAccType(accType1);
    }

    // method to confirm account creation
    public void setAccType(String accType1) {
        if (accType == "Current" || accType == "Corporate") {
            accType = accType1;
            System.out.printf("\n%s account created for %s %s of %s\n", accType1, getFirstName(), getLastName(),
                    getAddress());
        } else
            System.out.println("You typed an incorrect account type");
    }

    // method to perform overdraft
public void overDraft(double amount)
{
double balance = getAccBalance();
double newBalance = balance - amount - 5; //calculate new balance deducting, withdrawn amount and 5 Naira charge
setAccBalance (newBalance);
}

@Override
//method to effect cash withdrawal and override abstract method withdrawal in super class
public void withdrawal(double amount)
{
double availableBalance;
availableBalance = getAccBalance();
if ((availableBalance - amount) < 0)
{
overDraft (amount);
System.out.printf ("\n\n%s %s you have withdraw more than your available balance and you will be charged 5.00 NAIRA per day for overdraft services.\nHere’s your cash. Your new balance is %.2f NAIRA", getFirstName(), getLastName(), getAccBalance());
}
else
{
setAccBalance((availableBalance - amount));
System.out.printf ("\nHere's your cash. Your new balance is %.2f NAIRA", getAccBalance());
}
}
}
