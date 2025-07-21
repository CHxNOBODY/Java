public class main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "1234567890", 5000);
        customer.getAccount().deposit(1000);
        customer.getAccount().withdraw(200);
        System.out.println(customer.getAccount().getBalance());
        BankAccount.interestRate = 0.05;

        Car car1 = CarFactory.produceCar("Civic", "Red", "1HGCM82633A123456");
        Car car2 = CarFactory.produceCar("Accord", "Blue", "1HGCM82633A123457");
        System.out.println("Total Car Produce: " + Car.totalCarsProduced);
        System.out.println("Objet: " + car1.totalCarsProduced);
        System.out.println("Class: " + Car.totalCarsProduced);

        Mage mage = new Mage("Gandalf");
        mage.displayStats();
        mage.castSpell();
        mage.castSpell();
    }
}