import java.util.Scanner;

public class Objective3Lab2 {
  public static void main(String[] args) {

    String userInput = "";
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What's your name? ");
    userInput = keyboard.next();

    System.out.println("Hello " + userInput);
  }
}
