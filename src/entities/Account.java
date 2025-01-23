package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double balance) {
        this.balance = balance;
        this.number = number;
        this.holder = holder;
    }

    public Account() {

    }
    // Métodos de acesso (getters e setters)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // Metodo para realizar depósito
    public void deposit(double deposit) {
        this.balance += deposit;
    }
    // Metodo para realizar saque (com taxa)
    public void withdraw(double withdraw) {
        this.balance -= withdraw;
        this.balance -= 5;

    }

    @Override
    public String toString() {
        return "Account " +
                number +
                ", Holder: " + holder +
                ", Balance: $" + String.format("%.2f", balance);
    }
}
