package CWH_CH_8;
//class employee{
//    int Salary;
//    String Name;
//    public int getSalary(){
//        return Salary;
//    }
//    public String getName(){
//        return Name;
//    }
//    public void setName(String n){
//        Name = n;
//    }
//
//}

//class cellphone{
//    public void ring() {
//        System.out.println("Ringing...");
//    }
//     public void vibrate() {
//         System.out.println("Vibrating...");
//     }
//
//     public void callFriend(){
//         System.out.println("Calling Rounak...");
//            }
//}

//class Square{
//    int side;
//
//    public void calculateArea(){
//        System.out.println(side * side);
//    }
//    public void calculatePerimeter(){
//        System.out.println(4 * side);
//    }
//}


//class Rectangle{
//    int length;
//    int breadth;
//
//    public int calculateArea(){
//        return length * breadth;
//    }
//
//    public int calculatePerimeter(){
//        return 2 * (length + breadth);
//    }
//}

//class TommyVecetti{
//    public void hit(){
//        System.out.println("Hitting...");
//    }
//    public void run(){
//        System.out.println("Running...");
//    }
//    public void fire(){
//        System.out.println("Firing...");
//    }
//}

class Circle{
    int radius;

    public void area(){
        System.out.println(22/7f * radius * radius);
    }

    public void circumference(){
        System.out.println(2 * 22/7f * radius);
    }
}
public class CWH_39_PS {
    public static void main(String[] args) {
        //Problem 1:-
//        employee Aditya = new employee();
//        Aditya.Salary = 90;
//        Aditya.setName("Aditya Kumar Gupta");
//        System.out.println(Aditya.getName());
//        System.out.println(Aditya.getSalary() + " Thousand Dollars");

        //Problem 2:-
//        cellphone asus = new cellphone();
//        asus.callFriend();
//        asus.ring();
//        asus.vibrate();

        //Problem 3:-
//        Square Big = new Square();
//        Big.side = 5;
//        Big.calculateArea();
//        Big.calculatePerimeter();

        //Problem 4:-

//        Rectangle Small = new Rectangle();
//        Small.length = 5;
//        Small.breadth = 8;
//        System.out.println(Small.calculateArea());
//        System.out.println(Small.calculatePerimeter());

        //Problem 5:-

//        TommyVecetti Player = new TommyVecetti();
//        Player.hit();
//        Player.run();
//        Player.fire();

        Circle Medium = new Circle();
        Medium.radius = 3;
        Medium.area();
        Medium.circumference();
    }
}
