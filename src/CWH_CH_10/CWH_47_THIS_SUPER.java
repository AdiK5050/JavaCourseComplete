package CWH_CH_10;

class aClass {
    public int returnsOne() {
        return 1;
    }
    int a;
    public int getA() {
        return a;
    }

    aClass(){
        System.out.println("I am a parent class constructor with no args");
    }

    aClass(int a) {
        this.a = a;
        System.out.println("I am a parent class constructor");
    }
}
class anotherClass extends aClass {
    anotherClass(){
        System.out.println("I am a derived class constructor with no args");
    }
    anotherClass(int c) {
        super(c);
        System.out.println("I am a derived class constructor");
    }

}
public class CWH_47_THIS_SUPER {
    public static void main(String[] args) {

        aClass a = new aClass(55);
        System.out.println(a.returnsOne());
        System.out.println(a.getA());
        anotherClass b = new anotherClass(54);



    }
}
