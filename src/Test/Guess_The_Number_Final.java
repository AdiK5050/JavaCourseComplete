package Test;
import java.util.Scanner;
import java.util.Random;

class guessTheNumberGame {
    //to generate a random number
    int randomGenerated;

    guessTheNumberGame() {
        Random Generate = new Random();
        randomGenerated = Generate.nextInt(1, 101);
    }

    //to take user input


    //to verify conditions
    public int verification(int count) {
        System.out.println("Input Your Guess Here:- ");
        Scanner input = new Scanner(System.in);
        int inputGenerated = input.nextInt();

        if (inputGenerated > 100 || inputGenerated < 0) {
            System.out.println("Input Must be from 0 to 100");
        } else if (inputGenerated < randomGenerated) {
            if (inputGenerated > randomGenerated - 10) {
                System.out.println("You Guessed Less(Too Close!!!)");
            } else {
                System.out.println("You Guessed Less");
            }
        } else if (inputGenerated > randomGenerated) {

            if (inputGenerated < randomGenerated + 10) {
                System.out.println("You Guessed More(Too Close!!!)");

            } else {
                System.out.println("You Guessed More");

            }
        } else if (inputGenerated == randomGenerated) {
            System.out.println("You Guessed It Right!! \n No. of tries = " + count + 1);
            return count;
        }
        count++;
        return verification(count);
    }
}
public class Guess_The_Number_Final {
    public static void main(String[] args) {
//        System.out.println("Input your guess here:- ");
        guessTheNumberGame New = new guessTheNumberGame();
        New.verification(0);
    }
}
