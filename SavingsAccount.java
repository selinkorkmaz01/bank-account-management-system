public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountHolder, int accountNumber,
                          double balance, double interestRate) {
        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}
