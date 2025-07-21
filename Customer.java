public class Customer {
    private String name;
    private BankAccount account;

    public Customer(String name, String accountNumber, double balance) {
        this.name = name;
        this.account = new BankAccount(accountNumber, balance);
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }
}

