package CWH_CH_11;
//Default method is used to add a new method in an interfaces
//without adding and defining it in further classes in which
//that interface is used ... it will implement to all
//Private Method cannot be used by implemented classes, but
//it can be used in the interface class it is defined in
interface Camera{
    void takeSnap();
    void takeVideo();
    private void greet(){
        System.out.println("Good Morning!!!");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording 4k Video");
    }
}
interface Wifi{
    String[] getsWifiInfo();
    void connectsToWifi();
}
class Call{
int Number = 100;
public void call(){
    System.out.println("Calling "+ Number);
}
public void picksCall(){
    System.out.println("Connnecting");
}
    }
class SmartPhone extends Call implements Camera, Wifi{
    @Override
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    @Override
    public void takeVideo(){
        System.out.println("Taking Video");
    }
    @Override
    public String[] getsWifiInfo(){
        String wifi[] = { "Adi" , "didi" , "choti" };
        return wifi ;
    }

    @Override
    public void connectsToWifi() {
        System.out.println("Wifi Connected");
    }
    //we can override this default method if we want to but it's not necessary
//    @Override
//    public void record4KVideo(){
//        System.out.println("Recording in 4K in Smartphone");
//    }
}

public class CWH_57_DEFAULT_METHOD {
    public static void main(String[] args) {
        SmartPhone Realme = new SmartPhone();
        Camera RealmePhone = new SmartPhone();
        Realme.takeSnap();
        String[] wifiNames = Realme.getsWifiInfo();
        for( String names : wifiNames) {
            System.out.println(names);
        }
        Realme.connectsToWifi();
//        we do not need to implement this method in all the implemented classes after using default method
        Realme.record4KVideo();
    }



}
