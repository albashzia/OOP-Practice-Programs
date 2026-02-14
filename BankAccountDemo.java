//creating Account class
class Account{

    //defining attribute
    int balance;

    //non-parameterized constructor
    Account(){
        balance = 1000;
    }

    //parameterized constructor
    Account(int balance){
        this.balance = balance;
    }

    //method to withdraw amount from account
    void withdraw(int amount){
        if (amount<balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    //method to deposit amount into account
    void deposit(int amount){
        balance = balance + amount;
    }
}

//main class
public class BankAccountDemo {

    //main method
    public static void main(String[] args) {

        //creating first object using default constructor
        Account a1 = new Account();

        //displaying initial balance
        System.out.println(a1.balance);

        //calling withdraw() method
        a1.withdraw(300);
        System.out.println(a1.balance);

        //calling deposit() method
        a1.deposit(2000);
        System.out.println(a1.balance);

        System.out.println("");

        //creating second object using parameterized constructor
        Account a2 = new Account(4000);

        //displaying initial balance
        System.out.println(a2.balance);

        //calling withdraw() method
        a2.withdraw(2500);
        System.out.println(a2.balance);

        //calling deposit() method
        a2.deposit(3000);
        System.out.println(a2.balance);
    }
}
