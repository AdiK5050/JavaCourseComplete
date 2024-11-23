package CWH_CH_6;

public class CWH_29_PS {
    public static void main(String[]args) {
        //Question 1:-


//        float marks[] = {5.5f , 4.5f , 3.3f , 6.5f , 2.5f};
//        float a = 0;
//        for (int i = 0; i < marks.length; i++) {
//            a += marks[i];
//        }
//        System.out.println(a);

        //Question 2:-


//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//        int b = 6;
//        boolean present = false;
//        for(int a = 0; a<arr.length; a++) {
//            int c = arr[a];
//            if(b==c){
//                present = true;
//                break;
//            }
//        }
//        if(present){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }


        //Question 3:-


//        int Physics[] = {55, 44, 95, 87, 33};
//        float last = 0;
//        for(int avg : Physics){
//            last = last + avg;
//        }
//        System.out.println(last/Physics.length);

        //Question 4:-


//        int mat1[][] = {{1 , 2 , 3},
//                        {4 , 5 , 6}};
//        int mat2[][] = {{1 , 2 , 3},
//                        {4 , 5 , 6}};
//        int result[][] = {{0,0,0},
//                          {0,0,0}};
//
//        for( int i = 0 ; i<mat1.length; i++){
//            for( int j = 0 ; j < mat1[i].length; j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j] + "  ");
//            }
//            System.out.println("");
//        }


//        //Question 5:-

        //Method 1

//        System.out.println("Reversed Array");
//        int array[] = {5,4,3,2,1};
//        System.out.print("{");
//        for(int i = array.length - 1 ; i >= 0 ; i--){
//
//            System.out.print(array[i] + ",");
//        }
//        System.out.print("}");

        //Method 2

//        int arr[] = {1,2,3,4,5};
//        int l = arr.length;
//        int n = Math.floorDiv(l , 2);
//
//        int temp;
//
//        for(int i = 0; i<n ; i++) {
//            //Swap Formula:- Swap arr[i] and arr[l - 1 - i]
//            // |i| |l - 1 - i| | temp |
//
//            temp = arr[i];
//            arr[i] = arr[l - 1 - i];
//            arr[l - 1 - i] = temp;
//        }
//            for(int element : arr) {
//                System.out.print(element + " ");
//            }

        //Question 6:-

//        int Max[] = {33, 44, 64, 444, 65};
//        int max_new = Integer.MIN_VALUE;
//        for (int e : Max) {
//            if (e > max_new) {
//                max_new = e;
//            }
//        }
//        System.out.println(max_new);

         //Question 7:-

//        int Min[] = {33 , 44, 64 , 444, 65};
//        int min_new = Integer.MAX_VALUE;
//        for(int e:Min){
//            if (e<min_new){
//                min_new=e;
//            }
//        }
//        System.out.println(min_new);

        //Question 8:-
//        int sorted[] = {1 , 4 , 8 , 16 , 3};
//        boolean isSorted = true;
//        for( int i = 0 ; i < sorted.length-1; i++) {
//            if (sorted[i] > sorted[i + 1]) {
//                isSorted = false;
//                break;
//                }
//            }
//        if(isSorted){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
//
//
     }
}
