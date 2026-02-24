class BankAccount {

    private String accountHolderName;
    private double balance;

    private static double interestRate;

    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        BankAccount.setInterestRate(5);

        BankAccount acc1 = new BankAccount("Kesha", 10000);
        BankAccount acc2 = new BankAccount("Riya", 20000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.setInterestRate(7);

        System.out.println("After Updating Interest Rate:\n");

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}
