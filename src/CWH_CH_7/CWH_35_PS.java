package CWH_CH_7;

import com.sun.security.jgss.GSSUtil;

public class CWH_35_PS {
    //Question:-1
//    static int New(int n){
//        int x = 0;
//        int y;
//        while(x <= 10){
//            y = x * n;
//            System.out.print(n + "X" + x + "=" );
//            System.out.println(y);
//            x++;
//        }
//        System.out.print("Multiplication Table of:-");
//       return n;
//    }


    //Question 2:-
//    static  New(){
//        int a = 1;
//        while(a<5){
//            int b = 0;
//            while(b<a){
//                System.out.print("*");
//                b++;
//            }
//            System.out.println("");
//            a++;
//        }
//
//        return a;
//    }

    //Question 3:-
//     static int New(int a){
//         if(a<0){
//             return 0;
//         }
//         else{ return a + New(a-1);
//         }
//     }

    //Question 4:-
//    static int New(int a){
//        if(a<0){
//            return 0;
//        }
//        else{
//            int b = 0;
//            while(b<a){
//                b++;
//                System.out.print("*");
//            }
//            System.out.println("");
//            return New(a-1);
//        }
//    }

    //Question 6:-
//    static int New(int ... arr){
//        int Average = 0;
//        for(int a: arr){
//            Average += a;
//        }
//        return Average/arr.length;
//    }

    //Question 7:-
    static void RecStar(int n){
        if( n > 0){
            RecStar(n-1);
            for(int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    //Question 8:-
    static void RecStarRev(int n){
        if( n > 0){

            for(int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println();
            RecStarRev(n-1);
        }
    }
    public static void main(String[] args) {
//        int n = 8;
//        System.out.println(New(n));

//        System.out.println(New());

//        System.out.println(New(5));

//        System.out.println(New(6));

//        System.out.println(New(5,4,3,2,1));

        RecStar(4);
        RecStarRev(4);
    }
}





