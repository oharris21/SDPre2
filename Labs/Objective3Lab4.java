import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {

    String firstName, lastName;
    int age;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your first name: ");
    firstName = keyboard.next();

    System.out.println("Enter your last name: ");
    lastName = keyboard.next();

    System.out.println("Enter your age: ");
    age = keyboard.nextInt();

    System.out.println("First Name: " + firstName + ", Last Name " + lastName
                        + ", Age: " + age);
  }
}
