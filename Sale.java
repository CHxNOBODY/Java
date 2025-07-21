import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Quantity: ");
        int num = in.nextInt();

        double totalValue = num * 100;
        double netPrice = totalValue;

        if (totalValue >= 10000) {
            netPrice = totalValue * 0.70; 
        } else if (totalValue >= 1000) {
            netPrice = totalValue * 0.90; 
        }

        System.out.println("Total Price: " + totalValue);
        System.out.println("Net Price: " + netPrice);
    }
}
