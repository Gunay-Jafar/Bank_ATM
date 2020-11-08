import java.util.List;

public class Account {

    public Account(double balance) {
        this.balance = balance;
    }

    private double balance;
    private List<Transaction> transactions;

    public void showBalance() {
        System.out.println("Current balance " + balance + " AZN");
    }

    public void deposit(double amount) {

        balance+=amount;

    }

    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Enter less amount");
        }else {
            balance-=amount;
        }

    }
}
