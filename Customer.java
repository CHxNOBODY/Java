public class Customer {
    private String name;
    private BankAccount account;

    public Customer(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.account = new BankAccount(accountNumber, initialBalance);
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }
}

