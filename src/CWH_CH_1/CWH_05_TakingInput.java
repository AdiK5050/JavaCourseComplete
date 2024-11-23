package CWH_CH_1;
import java.util.Scanner;
public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User");
        Scanner Bro= new Scanner(System.in);
        //System.out.println("Enter Number 1");
        //int a = Bro.nextInt();
        //float i = Bro.nextFloat();
        //System.out.println("Enter Number 2");
        //int b = Bro.nextInt();
        //float j = Bro.nextFloat();
        //boolean n = Bro.hasNextInt();
        //System.out.println(n);
        //int sum= a + b;
        //float Sum= i+j;
        //System.out.println(sum);
        //System.out.println(Sum);
        // Haha! did the first calculation
        boolean m = Bro.hasNextInt();
        System.out.println(m);
        String str = Bro.nextLine();
        System.out.println(str);


    }
}
