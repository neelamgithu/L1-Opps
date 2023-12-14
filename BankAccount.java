import java.util.*;

public class BankAccount {
    double balance;
    int AccountNumber;
    int amount;
 BankAccount(double balance,int AccountNumber){
    this.balance=balance;
    this.AccountNumber= AccountNumber;
    
 }
public void Deposite(){
    System.out.println("enter amount to deposite");
    Scanner sc= new Scanner(System.in);
     amount=sc.nextInt();
    if (amount>0) {
      balance=amount+balance;
      System.out.println(balance);
      System.out.println("successully amount "+amount+"added"); 
    }    
    else
      {
        System.out.println("plz enter valid amount");
      }   
    }

public void Withdraw()
{
  if (amount > 0)
   {
     System.out.println("enter amout to withdraw");
     Scanner sc=new Scanner(System.in);
     amount=sc.nextInt();
     balance=balance-amount;
     System.out.println("remaining balance in acc"+ balance );
  }
  else
  {
    System.out.println("enter valid amount to withdraw");
  }

}


    public static void main(String[] args) {
        BankAccount ba = new BankAccount(60000,1234567890);
        
        ba.Deposite();
        ba.Withdraw();
    }
}
