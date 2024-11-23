package CWH_CH_12;

//import java.util.Scanner;
//To include all the files in java.util (including scanner class)
import java.util.*;
import CWH_CH_7.*;
import CWH_CH_10.CWH_46_CONS_IN_INHERITANCE;
public class CWH_65_PACKAGES {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String Name = sc.nextLine();
        System.out.println(Name);
        //Another Way
        java.util.Scanner sc1 = new java.util.Scanner(System.in);

        //Previous lectures revise from notes and "In VS code" folder in java

        //Trying to import method from previous lectures
        CWH_31_METHODS using = new CWH_31_METHODS();//didn't work
        CWH_46_CONS_IN_INHERITANCE using1 = new CWH_46_CONS_IN_INHERITANCE();//it doesn't work this way lol




    }
}
