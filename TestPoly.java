//TestPoly.java
//class to instantiate objects.
public class TestPoly {
    public static void main(String[] args) {
        // creating reference of type CurrentAccount and aim at CorporateCurrentAccount
        // object
        CurrentAccount CorpCurrentAccount = new CorporateCurrentAccount("Yemi", "Akin", "London Street", 55555, 2000.00,
                "Corporate");
        CorpCurrentAccount.withdrawal(5000);
        CorpCurrentAccount.displayBalance();
    }
}
