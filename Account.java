
public class Account {
    private double balance;

    public Account(double initialBalance) {
        if(initialBalance > 0.0){
            balance = initialBalance;
        }
    }
    public void credit(double amount){
        if(amount > 0.0){
           balance = balance + amount;
        }
    }

    public double getBalance() {
        return balance;
    }
    public void debit(double amount){
        if(amount > balance){
            System.out.println("Debit amount exceeded account balance");
        }
        else{
            balance -= amount;
        }
    }
  
    
    
}
