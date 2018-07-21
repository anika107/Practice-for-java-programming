
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);
        
        System.out.println("account1 balance: " + account1.getBalance());
        System.out.println("account2 balance: " + account2.getBalance());
        
        Scanner sc = new Scanner(System.in);
        
        double depositAmount;
        System.out.println("Enter deposit amount for account1: ");
        
        depositAmount = sc.nextDouble();
        System.out.println("Adding " + depositAmount + " to account1 balance");
        account1.credit(depositAmount);
        
        System.out.println("account1 balance: " + account1.getBalance());
        System.out.println("account2 balance: " + account2.getBalance());
        
        System.out.println("Enter deposit ammount for account2: ");
        depositAmount = sc.nextDouble();
        System.out.println("Adding " + depositAmount + " to account2 balance");
        account2.credit(depositAmount);
        
        System.out.println("account1 balance: " + account1.getBalance());
        System.out.println("account2 balance: " + account2.getBalance());
        
        System.out.println("Enter the amount to withdraw from account1: ");
        depositAmount = sc.nextDouble();
        System.out.println("Withdrawing " + depositAmount + " from account1");
        account1.debit(depositAmount);
        
        System.out.println("account1 balance: " + account1.getBalance());
        System.out.println("account2 balance: " + account2.getBalance());
        
        System.out.println("Enter the amount to withdraw from account2: ");
        depositAmount = sc.nextDouble();
        System.out.println("Withdrawing " + depositAmount + " from account2");
        account2.debit(depositAmount);
        
        System.out.println("account1 balance: " + account1.getBalance());
        System.out.println("account2 balance: " + account2.getBalance());
        
        
    }
}
