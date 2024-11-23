package Test;

import java.util.Scanner;
import java.util.Random;
class GameRetry{
    int randomGenerated;
    public GameRetry(){
        Random Generate = new Random();
        randomGenerated = Generate.nextInt(0 ,101);
    }
    int inputGenerated;
    public int input () {
        System.out.println("Input Your Guess Here:-");

        Scanner Input = new Scanner(System.in);

        int inputGenerated = Input.nextInt();


        if (inputGenerated > 100 || inputGenerated < 0) {
            System.out.println("Input Must be from 0 to 100");
        }

        else if (inputGenerated < randomGenerated) {
            if ( inputGenerated > randomGenerated - 10){
                System.out.println("You Guessed Less(Too Close!!!)");
            }
            else{
                System.out.println("You Guessed Less");
            }
        }
        else if (inputGenerated > randomGenerated) {

            if ( inputGenerated < randomGenerated + 10){
                System.out.println("You Guessed More(Too Close!!!)");

            }
            else{
                System.out.println("You Guessed More");

            }
        }
        else if (inputGenerated == randomGenerated) {
            System.out.println("You Guessed It Right!");

            System.out.println("Total no. of tries =");
            return 0;
        }
        return input();
    }

}
public class Guess_The_Number_Retry {
    public static void main(String[] args) {
        GameRetry Aditya = new GameRetry();
        Aditya.input();

    }
}
