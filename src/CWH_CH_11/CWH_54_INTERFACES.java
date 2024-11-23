package CWH_CH_11;
//all the methods in interface must be abstract
//we can implement more than one interfaces or interfaces along with class
//we will know more later

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface BlowHorn{
    void hornOnce();
    void hornTwice();
}

class avonCycle implements Bicycle , BlowHorn{
    int speed = 7;
    int a = 5;
    public void applyBrake(int decrement){
        speed = speed - decrement;
    }
    public void speedUp(int increment){
        speed = speed - increment;
    }
    public void hornOnce(){
        System.out.println("Horn");
    }
    public void hornTwice(){
        System.out.println("Horn , Horn");
    }
}
public class CWH_54_INTERFACES {
    public static void main(String[] args) {
        int i;
        // we cannot create an object of interfaces but we can use them as references
//        Bicycle Aditya = new Bicycle(); -> error
//        Bicycle Adityaa = new avonCycle(); // Possible


        avonCycle Mine = new avonCycle();
        Mine.applyBrake(2);
        System.out.println(Mine.speed);
        Mine.hornOnce();
        Mine.hornTwice();
        //We can create properties/attributes(int a , float b) in interfaces
        System.out.println(Mine.a);
        //But we can not modify the attributes in interfaces as they are final
//        Mine.a = 5;
        //But we can override the properties in the class like shown above

    }
}
