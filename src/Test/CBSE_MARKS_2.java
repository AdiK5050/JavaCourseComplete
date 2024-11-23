package Test;
import java.util.Scanner;
public class CBSE_MARKS_2 {
    public static void main(String[] args){
        System.out.println("Calculation of Marks Percentage");
        Scanner New= new Scanner(System.in);
        System.out.println("Physics");
        int Physics = New.nextInt();
        System.out.println("Chemistry");
        int Chemistry = New.nextInt();
        System.out.println("Maths");
        int Maths = New.nextInt();
        System.out.println("English");
        int English = New.nextInt();
        System.out.println("Physical_Education");
        int Physical_Education = New.nextInt();
        System.out.println("Hindi");
        int Hindi = New.nextInt();
        float Sum = (Physics + Chemistry + Maths + English + Physical_Education + Hindi);
        float Dum = Sum * 100;
        float Final = Dum / 600;
        System.out.println(Final);
        }
}
