import java.util.Scanner;
// Bank Account Class
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    // Check Balance Method
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
// ATM Class
class ATM {
    private BankAccount account;
    // Constructor
    public ATM(BankAccount account) {
        this.account = account;
    }
    // Menu Method
    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wit = sc.nextDouble();
                    account.withdraw(wit);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
// Main Class
public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(balance);
        ATM atm = new ATM(account);

        atm.start();
    }
}