import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {

        String name;
        Scanner input_name = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input_name.nextLine();

        int age;
        Scanner input_age = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = input_age.nextInt();

        if(age < 18) {
            System.out.println("You are too young.");
        } else {
            System.out.println("Have some fun bro.");
        }
    }
}
