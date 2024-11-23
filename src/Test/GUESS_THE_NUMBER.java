package Test;

import java.util.Scanner;
import java.util.Random;
class Game {
    static int Input;
    static int Random;
    public Game() {
        Random IntGeneration = new Random();
        Random = IntGeneration.nextInt(101);
    }
//    Scanner LoopInput = new Scanner(System.in);
//    Input = LoopInput.nextInt();

    static boolean Condition = Input == Random;

    static void Loop() {
            if (Input < Random) {
                System.out.println("You Guessed Less");
            }
            else if (Input > Random){
                System.out.println("You Guessed More");
            }
            else if (Condition = true) {
                System.out.println("You Guessed The Number!\n YOU WIN");
            }
    }
}

// so i am gonna use recursion here for taking input again and again;
public class GUESS_THE_NUMBER {
    public static void main(String[] args) {
        System.out.println("Enter Your Guess Here:-");
        Game Checking = new Game();
        Checking.Loop();
    }
}
