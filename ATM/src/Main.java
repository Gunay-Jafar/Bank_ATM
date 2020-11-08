import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome To ATM");
        System.out.println("*************");

        String[] menu = {"1. Balance", "2. Deposit", "3. Withdraw", "4. Transactions", "5. Exit"};

        int option;

        do {

            System.out.println("*************");

            for (String item : menu)
                System.out.println(item);
            option = scanner.nextInt();

        } while (option != 5);
    }
}
