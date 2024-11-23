package Test;

import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {

        System.out.println("Let's begin the fun game ROCK-PAPER-SCISSORS \n Rock = 1 \n Paper = 2 \n Scissors = 3 \nInput Here:- ");
        Random Computer = new Random();
        int r = Computer.nextInt(1,3);
        Scanner Input = new Scanner(System.in);
        int i = Input.nextInt();


        System.out.println("You Choosed:-");
        if(i==1){
            System.out.println("Rock");
        }
        else if(i==2){
            System.out.println("Paper");
        }
        else if (i==3){
            System.out.println("Scissors");
        }
        else{
            System.out.println("Your Input Is Invalid");
        }


        System.out.println("Computer Choosed:-");
       if(r==1){
           System.out.println("Rock");
       }
       else if(r==2){
           System.out.println("Paper");
       }
       else if(r==3){
           System.out.println("Scissors");
       }


       if(i==1&&r==1){
           System.out.println("It's a Draw");
       }
       else if(i==2&&r==2){
           System.out.println("It's a Draw");
       }
       else if(i==3&&r==3){
           System.out.println("It's a Draw");
       }
       else if (i==1&&r==2){
           System.out.println("YOU LOOSE");
       }
       else if (i==1&&r==3){
           System.out.println("YOU WON");
       }
       else if (i==2&&r==1){
           System.out.println("YOU WON");
       }
       else if (i==2&&r==3){
           System.out.println("YOU LOOSE");
       }
       else if (i==3&&r==1){
           System.out.println("YOU LOOSE");
       }
       else if (i==3&&r==2){
           System.out.println("YOU WIN");
       }
    }
}
