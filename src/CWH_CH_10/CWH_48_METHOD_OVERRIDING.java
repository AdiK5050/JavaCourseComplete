package CWH_CH_10;

class A {
    public int meth1(){
        return 12;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
        System.out.println("i am being overridden and i made changes here ... is it an error?");
        System.out.println("so when we give arguments here or in derived class ... it will be an error");
    }
}
class B extends A{
    // this annotation will cause error if we change the method being overridden,
    // but if we forget to make same changes in the method of child class. it alerts!
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");

    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class CWH_48_METHOD_OVERRIDING {
    public static void main(String[]args){
        A newA = new A();
        newA.meth2();

        B newB = new B();
        newB.meth2();
        newB.meth3();
    }
}
