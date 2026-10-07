public abstract class BankAccount {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds.");
        }
        balance -= amount;
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account type: " + getClass().getSimpleName());
        System.out.println("Account number: " + accountNumber);
        System.out.println("Holder name: " + holderName);
        System.out.printf("Balance: %.2f%n", balance);
    }

    public static class SavingsAccount extends BankAccount {
        private static final double ANNUAL_INTEREST_RATE = 0.04;

        public SavingsAccount(String accountNumber, String holderName, double balance) {
            super(accountNumber, holderName, balance);
        }

        @Override
        public double calculateInterest() {
            return balance * ANNUAL_INTEREST_RATE;
        }
    }

    public static class CurrentAccount extends BankAccount {
        private static final double ANNUAL_INTEREST_RATE = 0.02;

        public CurrentAccount(String accountNumber, String holderName, double balance) {
            super(accountNumber, holderName, balance);
        }

        @Override
        public double calculateInterest() {
            return balance * ANNUAL_INTEREST_RATE;
        }
    }

    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SA1001", "SAM", 1000.00);
        savingsAccount.deposit(2000.00);
        savingsAccount.withdraw(200.00);

        BankAccount currentAccount = new CurrentAccount("CA2001", "SAMEER", 5000.00);
        currentAccount.deposit(7000.00);
        currentAccount.withdraw(750.00);

        displayAccount(savingsAccount);
        displayAccount(currentAccount);
    }

    private static void displayAccount(BankAccount account) {
        account.displayDetails();
        System.out.printf("Calculated interest: %.2f%n%n", account.calculateInterest());
    }
}
