package CWH_CH_11;
abstract class Base{
    public Base(){
        System.out.println("I am base constructor");
    }
    public void getInfo(){
        System.out.println("My name is aditya and I am 19 years old");
    }
    abstract public void greet();
    abstract public void greet2();
}
//Now to extend this Base class we have two options
//Either override all the abstract methods
//Or use abstract keyword when defining the extended class
class Derived extends Base{
    public Derived(){
        System.out.println("I am a Derived constructor");
    }
    @Override
    public void greet(){
        System.out.println("Ohayo! Yui-Sama");
    }
    @Override
    public void greet2(){
        System.out.println("Hey Bro ... have been a while");
    }
}
abstract class Derived2 extends Base{
    public Derived2(){
        System.out.println("I am second derived constructor");
    }
}
public class CWH_53_ABSTRACT {
    public static void main(String[] args) {
        Derived der = new Derived();// it is possible
        der.getInfo();
//        Base be = new Base();// we can not create object of abstract class like this
//        Derived2 der2 = new Derived2();// Error
    }
}
