import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {

    double num1, num2, sum;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    num1 = keyboard.nextDouble();

    System.out.println("Please enter a second number: ");
    num2 = keyboard.nextDouble();

    sum = num1 + num2;

    System.out.println("The sum of " + num1 + " + " + num2 + " is " + sum);
  }
}
