package CWH_CH_9;

class Cylinder{
    private int radius;
    private int height;
    
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public Cylinder() {
        this.radius = 4;
        this.height = 5;
    }

    public void setRadius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public float calcArea(){
        return 2 * 22 / 7f * radius * height;
    }
    public void calcVolume(){
        System.out.println(22/7f * radius * radius * height);
    }
}

class Rectangle{
    int Length;
    int Breadth;

    public Rectangle(int Length , int Breadth){
        this.Length = Length;
        this.Breadth = Breadth;
    }
    public void calcArea(){
        System.out.println(Length * Breadth);
    }
}

class Sphere{
    int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public double getArea(){
       return 4 / 3 * Math.PI * radius * radius * radius;
    }
}

public class CWH_44_PS {
    public static void main(String[] args) {

        //Question 1 :-
//        Cylinder Aditya = new Cylinder();
//        Aditya.setRadius(4);
//        Aditya.setHeight(5);

        //Question 2 :-
//        Aditya.calcVolume();
//        System.out.println(Aditya.calcArea());

//        //Question 3 :-
//        Cylinder Aditya = new Cylinder(4 , 5);
//        Aditya.calcVolume();
//        System.out.println(Aditya.calcArea());

        Sphere Aditya = new Sphere(5);
        System.out.println(Aditya.getArea());

    }
}
