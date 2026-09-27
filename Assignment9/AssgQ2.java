import java.util.Scanner;

class BankAccount {
    String nm;
    double bal;

    BankAccount(String nm, double bal) {
        this.nm = nm;
        this.bal = bal;
    }

    void deposit(double amt) {
        bal = bal + amt;
        System.out.println(nm + " deposited " + amt + ". New balance = " + bal);
    }

    void withdraw(double amt) {
        if (amt > bal) {
            System.out.println(nm + " has insufficient balance to withdraw " + amt);
        } else {
            bal = bal - amt;
            System.out.println(nm + " withdrawn " + amt + ". New balance = " + bal);
        }
    }
}

class SavingAccount extends BankAccount {

    SavingAccount(String nm, double bal) {
        super(nm, bal);
    }

    void withdraw(double amt) {
        if (bal - amt < 100) {
            System.out.println(nm + "'s withdrawal denied. Balance cannot go below 100.");
        } else {
            bal = bal - amt;
            System.out.println(nm + " withdrawn " + amt + ". New balance = " + bal);
        }
    }
}

public class AssgQ2 {
    public static void main(String[] scp) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name for Bank Account holder: ");
        String nm = sc.nextLine();

        System.out.print("Enter starting balance: ");
        double bal = sc.nextDouble();

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double wd = sc.nextDouble();

        BankAccount b1 = new BankAccount(nm, bal);
        SavingAccount s1 = new SavingAccount(nm, bal);

        b1.deposit(dep);
        s1.withdraw(wd);

        sc.close();
    }
}