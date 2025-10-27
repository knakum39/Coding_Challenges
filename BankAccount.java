package Java_coding_challenges;

public class BankAccount {
    //Implement deposit(), withdraw(), and getBalance() methods with proper validation.

    // ✅ Private field (Encapsulation)
    private double balance;

    // ✅ Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // ✅ Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            // balance = balance + amount;
            System.out.println("Balance after deposit: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // ✅ Withdraw method with validation
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        }
    }

    // ✅ Getter method
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
         // Example input
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        account.getBalance();
    }
}
