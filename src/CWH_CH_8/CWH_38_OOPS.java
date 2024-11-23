package CWH_CH_8;
/*
// Lec 36 and Lec 37 was just notes description;
 */

//only one public class can exist in one java file;
class Employee1{
    int id;
    int Salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public void salarydetail(){
        System.out.println("My salary is " + Salary + " Thousand Dollars");
    }
}
public class CWH_38_OOPS {
    public static void main(String[] args) {
        System.out.println("This is our new custom class");
        //instantiating a new Employee object;
        Employee1 Aditya = new Employee1();
        Employee1 Shadow = new Employee1();
        //Setting Attributes;
        Aditya.id = 1;
        Aditya.name = "Aditya";
        Aditya.Salary = 34;
        Shadow.id = 2;
        Shadow.name = "Shadow";
        Shadow.Salary = 30;
        //Printing the Attributes;
        System.out.println(Aditya.id);
        System.out.println(Aditya.name);
        //instead of above just call the method;
        Aditya.printDetails();
        Aditya.salarydetail();
        Shadow.printDetails();
        Shadow.salarydetail();

    }
}
