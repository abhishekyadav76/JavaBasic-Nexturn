package DAY6;

public class BankMangement {

    String accountHolder;
    int accountNumber;
    double balance;

    BankMangement(String accountHolder,int accountNumber,double balance)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depositing $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        System.out.println();
    }


    void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawing $" + amount);
            System.out.println("New Balance: $" + balance);
        } else if (amount > balance)
        {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
        System.out.println();
    }

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println();
    }



    public static void main(String[] args) {

        BankMangement account = new BankMangement("Abhishek", 45679, 50000.0);

        account.displayAccountDetails();

        account.deposit(15000.0);
        account.withdraw(20000.0);

    }
}
