import java.util.Scanner;

class ATM_Machine {
    float balance;
    int PIN = 1234;
    Scanner sc = new Scanner(System.in);

    public void checkPin() {
        System.out.println("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) {
            Menu();
        } else {
            System.out.println("Invalid Pin");
            checkPin();
        }
    }

    public void Menu() {
        System.out.println("----SERVICES----");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.println("Enter your choice: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Check_Balance();
                break;
            case 2:
                Deposit_Money();
                break;
            case 3:
                Withdraw_Money();
                break;
            case 4:
                System.out.println("-----THANKS FOR CONNECTING WITH US------");
                System.exit(1);
            default:
                System.out.println("Please enter a valid option.");
                Menu();
                break; // added break to ensure proper switch-case behavior
        }
    }

    public void Check_Balance() {
        System.out.println("Your Balance: " + balance);
        System.out.println("Enter 0 for exit OR press 1 for Menu");

        int x = sc.nextInt();
        if (x == 0) {
            System.out.println("--THANKS FOR CONNECTING WITH US--");
        } else if (x == 1) {
            Menu();
        } else {
            System.out.println("Invalid Option!");
        }
    }

    public void Deposit_Money() {
        System.out.println("Enter the amount you want to deposit: ");
        int amt = sc.nextInt();

        if (amt < 0) {
            System.out.println("Invalid amount!"); // added this message for invalid input
            System.out.println("Enter 0 for exit OR press 1 for Menu");
            int y = sc.nextInt();
            if (y == 0) {
                System.out.println("--THANKS FOR CONNECTING WITH US--");
            } else if (y == 1) {
                Menu();
            } else {
                System.out.println("Invalid Option!");
            }
        } else {
            balance += amt;
            System.out.println("Amount Deposited Successfully! Your new Balance is: " + balance);

            System.out.println("Enter 0 for exit OR press 1 for Menu");
            int cd = sc.nextInt();
            if (cd == 0) {
                System.out.println("--THANKS FOR CONNECTING WITH US--");
            } else if (cd == 1) {
                Menu();
            } else {
                System.out.println("Invalid Option!");
            }
        }
    }

    public void Withdraw_Money() {
        System.out.println("Enter the amount to be withdrawn: ");
        int withdraw_amt = sc.nextInt();

        if (withdraw_amt < 0) {
            System.out.println("Invalid amount!"); // added this message for invalid input
            System.out.println("Enter 0 for exit OR press 1 for Menu");
            int z = sc.nextInt();
            if (z == 0) {
                System.out.println("--THANKS FOR CONNECTING WITH US--");
            } else if (z == 1) {
                Menu();
            } else {
                System.out.println("Invalid Option!");
            }
        } else {
            if (withdraw_amt > balance) {
                System.out.println("Insufficient Balance!");
            } else {
                balance -= withdraw_amt;
                System.out.println("Amount Withdrawn Successfully! Your new Balance is: " + balance);
            }

            System.out.println("Enter 0 for exit OR press 1 for Menu");
            int cw = sc.nextInt();
            if (cw == 0) {
                System.out.println("--THANKS FOR CONNECTING WITH US--");
            } else if (cw == 1) {
                Menu();
            } else {
                System.out.println("Invalid Option!");
            }
        }
    }
}

public class ATM_interface {
    public static void main(String args[]) {
        System.out.println("---WELCOME---");
        ATM_Machine ob = new ATM_Machine();
        ob.checkPin();
    }
}
