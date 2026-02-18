class Account1{
    private float balance;

    Account1(){
        balance = 0;
    }

    Account1(float amount){
        balance = amount;
    }

    void deposit(float amount){
        balance = balance + amount;
        System.out.println("Deposit Succesfull");
    }

    void withdraw(float amount){
        if(amount<=balance){
            System.out.println("Withdraw Successful");
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    float getBalance(){
        return balance;
    }
}


public class AccountCreator{
    public static void main(String[] args) {
        Account1 a1 = new Account1();
        a1.deposit(10000);
        a1.withdraw(3000);
        float tempAmount = a1.getBalance();
        Account1 a2 = new Account1(tempAmount);
        System.out.println(a2.getBalance());
    }
}