/***1. Assume that the Account, BusinessAccount, and SavingAccount classes make up the inheritance
 structure. The account informaƟon includes accountNo, yearOfOpening and balance. Depending
 on the Account type an interest is to be applied. The interest rate on the BusinessAccount is
 15%, while the interest rate on the SavingAccount is 10%. It is must for both these classes to
 provide funcƟonality for interest applicaƟon.
 You are required to design class diagram and implement the above scenario. ***/

abstract class AccountClass {

    private int accountNo;
    private int yearOfOpening;
    private double balance;

    public AccountClass(int accountNo, int yearOfOpening, double balance) {
        this.accountNo = accountNo;
        this.yearOfOpening = yearOfOpening;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public int getYearOfOpening() {
        return yearOfOpening;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display() {

        System.out.println("Account No: " + accountNo);
        System.out.println("Year Of Opening: " + yearOfOpening);
        System.out.println("Balance: " + balance);
    }

    public abstract void applyInterest();
}

public class BankAccountManagementSystem {
}
