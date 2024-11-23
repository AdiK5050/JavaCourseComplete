package CWH_CH_7;

public class CWH_32_METHOD_OVERLOADING {
    // Method Overloading;
    static void foo(){
        System.out.println("I love you");
    }
    static void foo(int a) {
        System.out.println("I love you " + a);
    }
    static void foo(int a , int b){
        System.out.println("I love you "  + a + " For the next " + b + " years");
    }

//    static void change(int x){
//        x = 44;
//    }

    // changing value of array this time;
//    static void change_2(int [] arr){
//        arr[0]= 98;
//    }




//    static void tell_joke(){                 //void is used when you don't want method to return to anything.
//        System.out.println("I am the best");
//    }


    public static void main(String[] args) {
//        tell_joke();

//        int a = 45;
//        change(a);
//        System.out.println("The value of int X after change is : " + a);
        // value of x won't change as expected;

//        int []marks = {33, 22, 67, 54, 65};
//
//        change_2(marks);
//        System.out.println("The value of marks after change is:" + marks[0]);

        // Method Overloading:- same name of methods but different functions due to different argument(condition);
        foo();
        foo(3000);
        foo(3000 , 3000);


    }
}
