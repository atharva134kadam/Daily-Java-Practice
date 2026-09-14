class BankAcc{
    private long accNo;
    private double balance;

    public void deposit(double amt){
        balance+=amt;
    }

    public void withdraw(double amt){
        balance-=amt;
    }

    public double getBalance(){
        return balance;
    }
}

public class Encapsulation{
    public static void main(String[] args){
        BankAcc acc1 = new BankAcc();

        acc1.deposit(500);
        acc1.withdraw(400);

        System.out.println(acc1.getBalance());
    }
}