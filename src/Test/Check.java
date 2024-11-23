package Test;

public class Check {
    static int New(int n) {
        for (int a = n; a > 0; a--) {
            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        return 1;

    }

    public static void main(String[] args) {

//        int a = 0;
//        System.out.println(a);
//        int b = a+1;
//        System.out.println(b);
//        int c = a + b;
//        System.out.println(c);
//        for(int i = 0; i <10; i ++) {
//        a = b;
//        b = c;
//        c = a + b;
//            System.out.println(c);
//    }
        System.out.println(New(4));

    }
}
