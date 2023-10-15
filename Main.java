import java.util.*;

class AtmInterface {
    private double balance;

    public AtmInterface(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Your balance is : " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Your balance is : " + balance);
    }

}

class ATM {
    private AtmInterface userAccout;

    public ATM(AtmInterface account) {
        this.userAccount = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Please choose an option: ");
    }

    public void performOption(int option){
        switch(option){
            case 1:
                System.out.println("Your balance is: " + userAccount.getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = sc.nextDouble();
                userAccount.deposit(depositAmount);
                System.out.println("Deposit successful.");
                break;
            case 3;
                System.out.print("Enter the amount to be withdrawn: ");
                double withdrawnAmount = sc.nextDouble();
                userAccount.withdraw(withdrawnAmount);
                System.out.println("Withdrawn Successful");
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AtmInterface userAccount = new AtmInterface(1000.0);
        ATM atm = new ATM(userAccount);
        Scanner sc = new Scanner(System.in);
        while (true) {
            atm.displayMenu();
            int choice = sc.nextInt();
            atm.performOption(choice);
        }
    }
}