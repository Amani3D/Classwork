package fridaythe13;

public class Account {

    public String customerName;
    public double accountBalance;

    public Account(String customerName, double accountBalance) {
        this.customerName = customerName;
        this.accountBalance = accountBalance;
    }

    public void deposit(double depositAmount) {
        accountBalance = depositAmount + accountBalance;
        System.out.println(accountBalance);

    }


    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > accountBalance) {
            System.out.println("insufficient funds");
        } else {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println(accountBalance);
        }


    }

    @Override
    public String toString() {
        return "Account{" +
                "customerName='" + customerName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}

