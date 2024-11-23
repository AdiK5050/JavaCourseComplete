package CWH_CH_11;
//creating interface
interface sampleInterface{
    void meth1();
    void meth2();
}
//inheriting interface
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
//class derivedSampleInterface extends sampleInterface{} --> error

//implementing interfaces by defining methods in a class
class sampleClass implements childSampleInterface{
    public void sampleClass(){
        System.out.println("this constructor does nothing");
    }
    public void meth1(){
        System.out.println("i am method 1");
    }
    public void meth2(){
        System.out.println("i am method 2");
    }
    public void meth3(){
        System.out.println("i am method 3");
    }
    public void meth4(){
        System.out.println("i am method 4");
    }
}
public class CWH_58_INHERITENCE_INTERFACE {
    public static void main(String[] args) {
        //Creating object
        sampleClass first = new sampleClass();
        sampleInterface First = new sampleClass();
        childSampleInterface Again = new sampleClass();
        first.meth1();
        first.meth3();
        First.meth1(); // possible
        //First.meth3(); //not possible because reference interface doesn't have that method
        Again.meth3(); //possible
        Again.meth1(); //also possible

    }
}
