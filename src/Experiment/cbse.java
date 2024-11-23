package Experiment;
import java.sql.SQLOutput;
import java.util.Scanner;
public class cbse {
    public static void main(String[] args) {
        System.out.println("PERCENTAGE CALCULATION FOR CBSE MARKS");
        Scanner New = new Scanner(System.in);
        System.out.println("Enter your marks:-");
//        int Input = New.nextInt();
//        if (Input>=100&&Input<=0){
//            System.out.println("Maximum marks is 100");
//        }
        System.out.println("Physics");
        int Physics = New.nextInt();
        System.out.println("Chemistry");
        int Chemistry = New.nextInt();
        System.out.println("Maths");
        int Maths = New.nextInt();
        System.out.println("English");
        int English = New.nextInt();
        System.out.println("Physical Education");
        int Physical_Education = New.nextInt();
        if(Physics > 100 || Chemistry > 100 || Maths > 100 || English > 100 || Physical_Education > 100 || Physics < 0 || Chemistry < 0 || Maths < 0 || English < 0 || Physical_Education < 0) ;
        {
            System.out.println("INVALID INPUT\nMaximum Marks is 100\nMinimum Marks is 0");
        }
       float Final = (Physics+Chemistry+Maths+English+Physical_Education)/5.0f;
        System.out.println("YOUR RESULT:-");
        System.out.print(Final);
        System.out.println("%");

        if (Final>=40){
            System.out.println("Congratulations You Passed The Exam");
        }
        else{
            System.out.println("Better Luck Next Time");
        }

    }
}
