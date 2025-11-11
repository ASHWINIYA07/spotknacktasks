import java.util.Scanner;

class bankaccount {
    private String accountNumber;
    private double balance;
    bankaccount(String accountNumber,double initialdeposit){
        this.accountNumber="124634297385934845";
        this.balance=initialdeposit;
    }
    bankaccount(String accountNumber){
        this.accountNumber=accountNumber;
        this.balance=0.0;
      }
    public  void deposit(double amount){
       if(amount>0){
        balance+=amount;
        System.out.println("the amount"+amount+"deposited successfully");
        System.out.println("updated balance:"+balance);
       }
       else{
        System.out.println("invalid input!");
       }
      }
    public void withdraw(double amount){
        if(amount>0 && balance>amount){
            System.out.println("your ammount will recieve shortly");
            balance-=amount;
            System.out.println("Balance:"+balance);
        }
        else if(balance>amount){
            System.out.println("insuffecient balance");
        }
        else{
            System.out.println("invalid amount");
        }
    }
    public static void main(String[] args) {
        bankaccount b1= new bankaccount("234",300.00);
        bankaccount b2= new bankaccount("1234");
        b1.deposit(1200);
        b1.withdraw(100);
        b2.deposit(2000);
        b2.withdraw(500);
    }
}
