package fridaythe13;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Najae", 400.00);
        account1.deposit(0.00);
        account1.withdraw(500.00);

        Account account2 = new Account("Bill", 300.00);
        account2.deposit(15.00);
        account2.withdraw(200.00);

        System.out.println(account1);
        System.out.println(account2);
    }
}
