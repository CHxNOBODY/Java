import java.util.Scanner;

public class main {
    public static void main(String[] args) {

      int age;
      Scanner input_age = new Scanner(System.in);

      System.out.print("Enter your age: ");
      age = input_age.nextInt();

      System.out.println("You are " + age + " years old.");

      int number = 0;
      Scanner input_number = new Scanner(System.in);

      System.out.print("Enter your number: ");
      number = input_number.nextInt();

      while(true){
          if(number <= 0) {
            System.out.println("Please try again.");
            break;
          } else if(number >= 10) {
            System.out.println("Please try again.");
            break;
          } else {
            System.out.println("Thank you for enter.");
            break;
          }
      }
      
      for(int i = 0; i < 10; i++) {
        System.out.print(i);
      }
    }
}
