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

class BusinessAccount extends AccountClass {

    public BusinessAccount(int accountNo,int yearOfOpening, double balance) {
        super(accountNo, yearOfOpening, balance);
    }

    @Override
    public void applyInterest() {

        double interest = getBalance() * 0.15;

        setBalance(getBalance() + interest);

        System.out.println("15% interest applied to Business Account.");
    }
}

class SavingAccount extends AccountClass {

    public SavingAccount(int accountNo, int yearOfOpening, double balance) {
        super(accountNo, yearOfOpening, balance);
    }

    @Override
    public void applyInterest() {

        double interest = getBalance() * 0.10;

        setBalance(getBalance() + interest);

        System.out.println("10% interest applied to Saving Account.");
    }
}

public class BankAccountManagementSystem {
    public static void main(String[] args) {

        BusinessAccount b1 = new BusinessAccount(101, 2020, 100000);

        SavingAccount s1 = new SavingAccount(202, 2022, 50000);

        System.out.println("Before Interest:");
        b1.display();
        System.out.println();

        s1.display();

        b1.applyInterest();
        s1.applyInterest();

        System.out.println("\nAfter Interest:");

        b1.display();
        System.out.println();

        s1.display();
    }
}
