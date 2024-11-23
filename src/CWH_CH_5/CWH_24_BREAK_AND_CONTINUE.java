package CWH_CH_5;

import jdk.jfr.Percentage;

public class CWH_24_BREAK_AND_CONTINUE {
    public static void main(String[] args) {
        //Break and continue using loop
//        for(int a = 0 ; a < 10 ; a++){
//            System.out.println(a);
//            if (a== 5){
//                System.out.println("The end");
//                break;
//            }
//        }


//        int a = 0;
//        while(a<10){
//            if(a==5){
//                System.out.println("The end");
//                break;
//            }
//            System.out.println(a);
//            a++;
//        }


//        int a = 0;
//        do {
//            System.out.println(a);
//            if (a == 5) {
//                System.out.println("The end");
//                break;
//            }
//            a++;
//        }
//        while(a<10);



        //using continue

        for (int a = 0; a < 10; a++) {
            if (a == 5) {
                System.out.println("The end");
                continue;
            }
            System.out.println(a);
        }

//        int a = 0;
//        while(a<10) {
//            a++;
//            if(a==5){
//                System.out.println("The end");
//                continue;
//        }
//            System.out.println(a);
//        }


//        int a = 0;
//        do{
//            a++;
//            if(a==5){
//                System.out.println("The end");
//                continue;
//            }
//        System.out.println(a);
//
//        }
//        while(a<10);
//        }
    }
}
