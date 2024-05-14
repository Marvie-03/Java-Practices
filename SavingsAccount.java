//SavingsAccount.java
//creating the concrete class, Savings account, which is a subclass of Account
public class SavingsAccount extends Account {
    private String accType; // additional variable to store account type
    // constructor to initialize variables

    public SavingsAccount(String first, String last, String address1, int accNo1, double accBalance1, String accType1) {
        // explicit call to super class constructor
        super(first, last, address1, accNo1, accBalance1);
        accType = accType1;
        setAccType(accType1);
    }

    // method to confirm account creation
    public void setAccType(String accType1) {
        if (accType == "Savings") {
            accType = accType1;
            System.out.printf("Savings account created for %s %s of %s\n", getFirstName(), getLastName(), getAddress());
        } else
            System.out.println("You typed an incorrect account type");
    }

    // method to effect cash withdrawal and override abstract method withdrawal in
    // super class
    @Override
    public void withdrawal(double amount) {
        double availableBalance;
        availableBalance = getAccBalance(); // obtains the current account balance
        if ((availableBalance - amount) < 0) // prevents withdrawal beyond available balance
        {
            System.out.printf("%s %s you cannot withdraw more than your available balance", getFirstName(),
                    getLastName());
        } else {
            availableBalance -= amount;
            setAccBalance(availableBalance);
            System.out.printf("\nHere's your cash. %s %s your new balance is %.2f NAIRA", getFirstName(), getLastName(),
                    getAccBalance());
        }
    }

    // method to calculate interest
    public void computeInterest(double time) // takes time as double, to accept fractions of a year
    {
        double Interest;
        double balance = getAccBalance();
        double newBalance;
        Interest = 0.05 * time * balance; // calculates interest at 5% interest rate
        newBalance = balance + Interest; // adds Interest to old balance to obtain new balance
        setAccBalance(newBalance); // sets balance to new balance
        System.out.println("\nInterest computed at 5% interest, your new balance is:");
        System.out.printf("%.2f NAIRA", newBalance);
    }
}