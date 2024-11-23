package CWH_CH_7;

public class CWH_34_RECURSION {
    // factorial 0 = 1
    // factorial (n) = n * (n-1) * (n-2) * ... 1
    // factorial (n) = n * factorial(n-1)
//    static int factorial(int n){
//        if( n == 0 || n == 1){
//            return 1;
//        }
//        else {
//            return n *  factorial( n-1);
//        }
//    }


//    static int factorial_iterative(int n){
//        if( n == 0 || n == 1){
//            return 1;
//        }
//        else {
//            int product = 1;
//            for(int i = 1; i <= n; i++){
//                product*=i;
//            }
//            return product;
//        }
//    }


    //Fibonacci Series:-
    //we need to print :- 0, 1, 1, 2, 3, 5, 8,
    //the third number is the addition of previous two
//    static int fibonacci(int a){
//        System.out.println(a);
//        int b =a+1;
//        System.out.println(b);
//        int c = a+b;
//        System.out.println(c);
//       for(int i = 0; i < 10; i++){
//           a = b;
//           b = c;
//           c = a + b;
//           System.out.println(c);
//       }
//       return 0;
//    }


    // Fibonacci Series using recursion
//    static int Fibonacci(int a){
////        System.out.println(a);
//        int b = a+1;
////        System.out.println(b);
//        int c = a + b;
////        System.out.println(c);
//        int i = 0 ;
//        if(i < 10){
//            i++;
//            a = b;
//            b = c;
//            c = a + b;
//            return Fibonacci(c);
//        }
//        else {
//           return 0;
//        }
//    }


    //Better:-
    static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int i = n;
            while (i > 0) {
                i++;
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        return 0;
        }
    }

    public static void main(String[] args) {
//        int x = 5;
//        System.out.println("The value of factorial x is " + factorial(x));
//
//        int a = 5;
//        System.out.println("The value of factorial a is " + factorial_itrative(a));
//
//        int p = 0;
//        System.out.println(fibonacci(p));

//        int a = 0;
//        System.out.println(Fibonacci(a));
        int[]terms = {1,2,3,4,5};
        for(int x : terms) {
            System.out.println(fibonacci(x));
        }
    }
}
