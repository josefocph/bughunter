/* Write a class to handle bank accounts

double balance = 1000;

void main() {
    withdraw(1200);
    deposit(100);
    IO.println(balance);
}

void withdraw(double amount) {
    balance = balance - amount;
}

void deposit(double amount) {
    balance = balance + amount;
}
*/

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }
}
void main() {
    BankAccount acc = new BankAccount(1000);

    acc.withdraw(1200);
    acc.deposit(100);

    IO.println(acc.getBalance());
}