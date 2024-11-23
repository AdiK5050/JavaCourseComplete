package CWH_CH_7;

public class CWH_31_METHODS {
//Method has been added:-
    public static int logic(int x , int y){        // if object is not created
        // int logic(int x , int y){        // if object is created
        int z;
        if (x<y){
            z = x+y;
        }
        else {
            z = x-y;
        }
        return z;
    }

    public static void main(String[] args) {
        //Methods is used to save yourself from the trouble of not repeating the same code over and over again.
        //For example if we wanna add two different sets numbers for different times,
        //We can store the calculation into a method.
//        int a = 5;
//        int b = 6;
//        int c;
//        if (a<b){
//            c = a+b;
//        }
//        else{
//            c=a-b;
//        }

//        int a1 = 10;
//        int b1 = 5;
//        int c1;
//        if (a1<b1){
//            c1 = a1+b1;
//        }
//        else{
//            c1=a1-b1;
//        }
//        System.out.println(c);
//        System.out.println(c1);

        //Instead of this we can create a method.
        // now we just need to assign values;
        int a = 5;
        int b = 8;
//        CWH_31_METHODS obj = new CWH_31_METHODS();
//        int p = obj.logic(a,b);
        int c = logic(a,b);
        System.out.println(c);

        //Only static method can be used in static void main , if the method is not static you need to
        // call the method by creating object like this:-
//        CWH_31_METHODS obj = new CWH_31_METHODS();
//        int p = obj.logic(a,b);

    }
}
