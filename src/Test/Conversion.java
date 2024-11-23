package Test;
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        System.out.println("From Kilometers");
        Scanner New = new Scanner(System.in);
        float KM = New.nextFloat();
        System.out.println("To Miles");
        float Miles = KM * 0.6213712F;
        System.out.println(Miles);



    }
}
