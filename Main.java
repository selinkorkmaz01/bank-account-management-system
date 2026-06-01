public class Main {

    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount(
                        "Selin Korkmaz",
                        1001,
                        5000,
                        0.05);

        account.displayAccountInfo();

        account.deposit(1000);

        account.withdraw(500);

        account.addInterest();

        account.displayAccountInfo();
    }
}
