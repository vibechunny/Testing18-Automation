abstract public class Account {
    private double balance;
    private String owner;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Account() {}
    public Account(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }
        this.balance += amount;
    }

    abstract public void withdraw(double amount);
}
