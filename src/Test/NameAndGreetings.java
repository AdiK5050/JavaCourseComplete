package Test;
import java.util.Scanner;
public class NameAndGreetings {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner Greeting = new Scanner(System.in);
        String str = Greeting.nextLine();
        System.out.println("Hello ");
        System.out.println(str);
        System.out.println("Welcome to Java");

    }
}
