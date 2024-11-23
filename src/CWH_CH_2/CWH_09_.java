package CWH_CH_2;
public class CWH_09_ {
    public static void main(String[] args){
        //Precedence and Assosiativity(No BODMAS rule valid here)
        // precedence of * and / is equal... jo pehle likho wo pehle use hoga
        float a = 5 * 6 - 55/5;
        System.out.println(a);
        float b = (1 / 5F + 5.5f*0.555f); 
        System.out.println(b);
        int x = 5;
        int y = 4;
        int Quiz = x - y / 2 ;
        System.out.println(Quiz);
        int A = 5;
        int B = 1;
        int C = 4;
        int F =  B*B - (4 * A * C ) / (2 * A);
        System.out.println(F);
        //Modulus Operator gives the remainder
        int again = 155%10;
        System.out.println(again);


    }
}
