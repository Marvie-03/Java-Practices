//AccountTest.java
//class to instantiate objects.
public class AccountTest {
    public static void main(String[] args) {
        // instantiating objects of class SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount1 = new SavingsAccount("Yinka", "Balogun", "Tyndale Street", 33333, 500.00,
                "Savings");
        CurrentAccount currentAccount1 = new CurrentAccount("Chika", "Nwafor", "Queens Street", 44444, 20.00,
                "Current");
        savingsAccount1.withdrawal(200); // testing withdrawal method
        savingsAccount1.deposit(100); // testing deposit method
        savingsAccount1.computeInterest(3); // testing Interest method
        currentAccount1.withdrawal(50); // testing withdrawal method
        currentAccount1.displayBalance(); // testing display balance method
        currentAccount1.deposit(400); // testing deposit method
    }
}
