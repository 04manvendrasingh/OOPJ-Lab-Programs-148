import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    double balance;

    Account(String customerName, int accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    void deposit(double amount) {
        balance = balance+amount;
        System.out.println("Deposit successful.");
    }

    void displayBalance() {
        System.out.println("Balance: INR " + balance);
    }

    void compoundInterest() {
        System.out.println("Compound interest not available");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance =balance-amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}


class CurrentAccount extends Account {
    double minBalance;
    double serviceCharge;

    CurrentAccount(String customerName, int accountNumber, double minBalance, double serviceCharge) {
        super(customerName, accountNumber);
        this.minBalance = minBalance;
        this.serviceCharge = serviceCharge;
    }

	void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance =balance-amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance. Service charge of INR" + serviceCharge );
            balance = balance-serviceCharge;
        }
    }
}



class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String customerName, int accountNumber, double interestRate) {
        super(customerName, accountNumber);
        this.interestRate = interestRate;
    }

    
    void compoundInterest() {
        double interest = balance * (interestRate / 100);
        balance =balance+interest;
        System.out.println("Interest of INR" + interest );
    }
}



public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount("Mohammed Zeeshan Umar", 1001, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("Manvendra Singh Chouhan", 2001, 1000.0, 10.0);

        System.out.print("Enter deposit amount for savings account: ");
        double savingsDepositAmount = scanner.nextDouble();
        savingsAccount.deposit(savingsDepositAmount);
        savingsAccount.displayBalance();
        savingsAccount.compoundInterest();
        savingsAccount.displayBalance();

        System.out.print("Enter deposit amount for current account: ");
        double currentDepositAmount = scanner.nextDouble();
        currentAccount.deposit(currentDepositAmount);
        currentAccount.displayBalance();

        System.out.print("Enter withdrawal amount for current account: ");
        double withdrawalAmount = scanner.nextDouble();
        currentAccount.withdraw(withdrawalAmount);
        currentAccount.displayBalance();

        scanner.close();
    }
}


