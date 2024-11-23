package CWH_CH_11;
//Question 1
abstract class Pen {
    abstract void write();
    abstract void refil();
}

//Question 2
class FountainPen extends Pen {
    public void write(){
        System.out.println("Writing");
    }
    public void refil(){
        System.out.println("REFILLING...");
    }
    public void changeNib(){
        System.out.println("CHANGING NIB...");
    }
}

//Question 3

interface basicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    public void jump(){
        System.out.println("Yahooooo!");
    }

    public void bite(){
        System.out.println("Nom Nom Nom");
    }
}

class Human extends Monkey implements basicAnimal{
    public void eat(){
        System.out.println("NOM NOM NOM");
    }
    public void sleep(){
        System.out.println("SWEEP!! HIBERNATE!!");
    }
    public void smart(){
        System.out.println("Studying...");
    }
}
//Question 4
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract String disconnect();
    public void repairNeeded(){
        System.out.println("repair needed");
    }
}
class SmartTelephone extends TelePhone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void lift(){
        System.out.println("lifting...");
    }
    public String disconnect(){
        return "Disconnected";
    }
    public int Addition(int a , int b){
        return a + b;
    }
}
//Question 5--> in main method

//Question 6
interface TVremote {
    void turnOn();
    void turnOff();
}
interface SmartTVremote{
    void jumpToChannelNumber(int a);
    void voiceSearch();
}

//Question 7
class TV implements TVremote{
    public void turnOn(){
        System.out.println("BEEP... BEEP... TURNING ON");
    }
    public void turnOff(){
        System.out.println("TURNS OFF");
    }

}

public class CWH_60_PS {
    public static void main(String[] args) {

        //Question 4
        SmartTelephone ONE = new SmartTelephone();
        TelePhone one = new SmartTelephone();
        ONE.disconnect();
        ONE.repairNeeded();
        System.out.println(ONE.Addition(5, 55));
        one.disconnect();
        one.lift();
        //System.out.println(ONE.Addition(5, 55));//Not Possible (POLYMORPHISM)

        //Question 5
        Human modernAge = new Human();
        Monkey stoneAge = new Human();
        modernAge.eat();
        modernAge.smart();
        //stoneAge.eat();//Not Possible
        //stoneAge.smart();//Not Possible
        stoneAge.jump();
    }
}
