package CWH_CH_10;

class Phone{
    public void greet(){
        System.out.println("WELCOME to your phone");
    }
    public void turnOn(){
        System.out.println("Turning on phone...");
    }
}
class SmartPhone extends Phone{
    public void Greet(){
        System.out.println("WELCOME to your smartphone");
    }
    public void turnOn(){
        System.out.println("Turning on smartphone...");
    }
}
public class CWH_49_DYNAMIC_METHOD_DISPATCH {
    public static void main(String[] args) {

//        Phone obj1 = new Phone();
//        obj1.turnOn();
//        SmartPhone obj2 = new SmartPhone();
//        obj2.turnOn();

        // we can create an object form superclass to subclass but vice versa is not allowed
        //we will only be able to call superclass method if it is not overridden
        //but if it is overridden then the method of subclass will be called
        Phone obj = new SmartPhone(); // this is allowed
//        SmartPhone object = new Phone(); // this is not allowed

        obj.greet();
//        obj.Greet();// this is a sub class method and it's not overridden so it can't be called;

        obj.turnOn();

    }
}
