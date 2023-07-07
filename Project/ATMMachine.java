import java.util.*;
class ATM
{
    float Balance;
    int PIN = 4435;

public void checkpin(){
    System.out.println("Enter your Pin");
    Scanner sc = new Scanner(System.in);
    int pin = sc.nextInt();
    if(pin==PIN)
    {
        menu();
    }
    else{
        System.out.println("Please enter the valid Pin");
    }

}

        public void menu()
    {
        System.out.println("Enter Your Choice");
        System.out.println("1.check Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Mone");
         System.out.println("4.Exit");


         Scanner sc = new Scanner(System.in);
         int opt = sc.nextInt();
         if(opt==1)
         {
            CheckBalance();
         }
         else if(opt==2)
         {
            withdrawMoney();
         }
         else if(opt==3)
         {
            depositMoney();
         }
         else if(opt==4){
            return;
         }
         else{
            System.out.println("Enter a valid Choice");
         }
    } 
    
    public void CheckBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw");
         Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdraw Successfully");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount to deposit");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance+ amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }


}
public class ATMMachine {
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkpin();
    }
}
