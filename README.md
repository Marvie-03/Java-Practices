# Account Management System

## Overview
This Java code provides an abstract class `Account` which serves as the blueprint for concrete account types like Current and Savings accounts. It encapsulates essential elements of an account such as owner's name, address, account number, and balance. Additionally, it implements methods for depositing funds, checking balance, and abstract method for withdrawals.

## Class Structure
- `Account`: An abstract class representing a generic account.
    - `Properties`:
        - `firstName`: First name of the account owner.
        - `lastName`: Last name of the account owner.
        - `address`: Address of the account owner.
        - `accNo`: Account number of the account.
        - `accBalance`: Current balance of the account.
    - `Constructor`: Initializes the account with provided details.
    - `Methods`:
        - `setFirstName()`: Sets the first name of the account owner.
        - `getFirstName()`: Returns the first name of the account owner.
        - `setLastName()`: Sets the last name of the account owner.
        - `getLastName()`: Returns the last name of the account owner.
        - `setAddress()`: Sets the address of the account owner.
        - `getAddress()`: Returns the address of the account owner.
        - `setAccNo()`: Sets the account number.
        - `getAccNo()`: Returns the account number.
        - `setAccBalance()`: Sets the account balance.
        - `getAccBalance()`: Returns the account balance.
        - `deposit()`: Adds funds to the account balance.
        - `displayBalance()`: Returns a formatted string displaying the account balance.
        - `withdrawal()`: Abstract method to withdraw funds (to be implemented by subclasses).

## Usage
To use this code, follow these steps:
1. Extend the `Account` class to create specific account types such as `CurrentAccount` or `SavingsAccount`.
2. Implement the `withdrawal()` method in the concrete account classes.
3. Create instances of the concrete account classes and perform operations such as deposit and withdrawal.

## Example
```java
// Example of using the Account class
public class Main {
    public static void main(String[] args) {
        // Create a Current Account
        CurrentAccount currentAccount = new CurrentAccount("John", "Doe", "123 Main St", 1001, 500.0);
        
        // Deposit funds
        currentAccount.deposit(200.0);
        
        // Display balance
        System.out.println(currentAccount.displayBalance());
        
        // Withdraw funds
        currentAccount.withdrawal(100.0);
        
        // Display balance after withdrawal
        System.out.println(currentAccount.displayBalance());
    }
}
