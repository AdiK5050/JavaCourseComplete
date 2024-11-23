package CWH_CH_7;

public class CWH_33_VAR_ARGS {
//    static int sum(int a , int b){
//        return a+b;
//    }
//    static int sum(int a , int b , int c){
//        return a + b + c;
//    }
    //but instead of making two methods we can add a variable argument in an array
//    static int sum(int ... arr){
//        int result = 0;
//        for(int a:arr) {
//            result += a;
//        }
//        return result;
//    }
    static int sum (int x , int ... arr){
        int result = x;
        for(int a : arr){
            result += a;
        }
        return result;


    }
    public static void main(String[] args) {
        System.out.println(sum(2));
        System.out.println(sum(1,5));
        System.out.println(sum(1, 5, 6));
        System.out.println(sum(1,2,3,4,5));
    }
}
