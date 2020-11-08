import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome To ATM");
        System.out.println("*************");

        String[] menu = {"1. Balance", "2. Deposit", "3. Withdraw", "4. Transactions", "5. Exit"};

        Account account = new Account(0);

        int option;
        double amount;

        do {

            System.out.println("*************");

            for (String item : menu)
                System.out.println(item);
            option = scanner.nextInt();
            switch (option) {

                case 1:
                    account.showBalance();
                    break;
                case 2:
                    System.out.println("Enter deposit amount : ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter withdraw amount : ");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Bye, Thank you");
                    break;
                default:
                    System.out.println("Duzgun secim etmediniz!");
            }

        } while (option != 5);
    }
}
