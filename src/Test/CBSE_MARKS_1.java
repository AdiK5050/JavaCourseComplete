package Test;
import java.util.Scanner;
public class CBSE_MARKS_1 {
    public static void main(String[] args){
        System.out.println("Calculation of Percentage");
        Scanner New = new Scanner(System.in);
        System.out.println("Physics");
        float Physics = New.nextInt();
        System.out.println("Chemistry");
        float Chemistry = New.nextInt();
        System.out.println("Maths");
        float Maths = New.nextInt();
        System.out.println("English");
        float English = New.nextInt();
        System.out.println("Physical_Education");
        float Physical_Education = New.nextInt();
        System.out.println("Hindi");
        float Hindi = New.nextInt();
        System.out.println("Final");
        float Final = 100*(Physics+Chemistry+Maths+English+Physical_Education+Hindi)/600;
        System.out.println(Final);
    }
}
