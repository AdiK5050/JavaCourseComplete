//To write a programme to find the sum of digits of any n digit number;
package REVISION_ROUGH;
import java.util.Scanner;

//Trying to use recursion:-
//class nDigits {
//    int Integer;
//
//    nDigits() {
//        System.out.println("INPUT YOUR 3 DIGIT NUMBER HERE:- ");
//        Scanner classInput = new Scanner(System.in);
//        Integer = classInput.nextInt();
//    }
//
//    public int usingRecursion() {
//        int sum = 0;
//        int rem;
//
//            rem = Integer - (Integer / 10) * 10;
//            sum = sum + rem;
//            Integer = Integer / 10;
//        if (Integer != 0) {
//            return usingRecursion();
//        } else {
//            return sum;
//        }
//    }
//}

public class CW {
   static int Input;
    static int logic(){
        int sum = 0;
        int rem;
        for(Input = Input ; Input !=0;){
        rem = Input - (Input/10) * 10;
        sum = sum + rem;
        Input = Input/10;
        }
        return sum;
    }
    public static void main(String[] args) {

//        nDigits Aditya = new nDigits();
//        System.out.println(Aditya.usingRecursion());


//        System.out.println("INPUT YOUR 3 DIGIT NUMBER HERE:- ");
//        Scanner New = new Scanner(System.in);
//        Input = New.nextInt();

        //Storing logic into method and then calling it
//        int f = logic();
//        System.out.println(f);

//        int sum = 0;
//        int rem;
//        rem = Input - (Input/10) * 10;
//        sum = sum + rem;
//        Input = Input/10;
//        rem = Input - (Input/10) * 10;
//        sum = sum + rem;
//        Input = Input/10;
//        rem = Input - (Input/10) * 10;
//        sum = sum + rem;
//        Input = Input/ 10;
//        System.out.println(sum);

        //Trying to use a loop:-
//        int sum = 0;
//        int rem;
//
//         for(Input = Input ; Input != 0 ;){
//            rem = Input - (Input/10) * 10;
//            sum = sum + rem;
//           Input = Input/10;
//        }
//        System.out.println(sum);

//        while (Input != 0){
//            rem = Input - (Input/10) * 10;
//            sum = sum + rem;
//            Input = Input/ 10;
//        }
//        System.out.println(sum);

//        do{
//            rem = Input - (Input/10) * 10;
//            sum = sum + rem;
//            Input = Input/ 10;
//        }while(Input != 0);
//        System.out.println(sum);
    }
}
