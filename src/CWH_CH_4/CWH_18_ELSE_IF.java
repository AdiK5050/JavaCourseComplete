package CWH_CH_4;
import java.util.Scanner;
public class CWH_18_ELSE_IF {
    public static void main(String[] args) {
//        Scanner New = new Scanner(System.in);
//        int Input = New.nextInt();
//        if(Input == 2){
//            System.out.println("It is the least even prime number");
//        }
//        else if(Input == 3){
//            System.out.println("It is the least odd prime number");
//        }
//        else if(Input == 97){
//            System.out.println("It is the biggest two digit prime number");
//        }
//        else{
//            System.out.println("No info.");
//        }
        Scanner New_1 = new Scanner(System.in);
        int Input = New_1.nextInt();
//        switch(Input){
//                case 2:
//                    System.out.println("It is the least even prime number");
//                    break;
//                case 3:
//                    System.out.println("It is the least odd prime number");
//                    break;
//                case 97:
//                    System.out.println("It is the biggest two digit prime number");
//                    break;
        //Enhanced switch is Same as switch but better in representation:-
        switch (Input) {
            case 2 -> System.out.println("It is the least even prime number");
            case 3 -> System.out.println("It is the least odd prime number");
            case 97 -> System.out.println("It is the biggest two digit prime number");
        }







    }
}
