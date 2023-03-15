import java.util.Scanner;
class Account {                            //class1 to store varibles info
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Account account = new Account(balance);   //obj of first class

        System.out.print("Enter debit amount: ");
        double amount = scanner.nextDouble();

        account.debit(amount);

        System.out.println("Current balance: Rupees" + account.getBalance());

    }
}
