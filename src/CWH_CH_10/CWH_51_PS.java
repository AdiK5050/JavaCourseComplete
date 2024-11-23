package CWH_CH_10;
class Circle{
    int radius;
    Circle(){
        System.out.println("set sides");
    }
   Circle(int r){
       this.radius = r;
   }
   public double circleArea(){
       return Math.PI * radius * radius;
   }
}
class Cylinder extends Circle{
   int height;
   Cylinder(int r , int h){
       super(r);
       this.height = h;
   }
   public double cylinderArea(){
       return 2 * Math.PI * radius * height;
   }
   public double CylinderVolume(){
       return Math.PI * radius * radius * height;
   }
}

class Rectangle{
    int sideA;
    int sideB;
    Rectangle(){
        System.out.println("set height");
    }
    Rectangle(int a , int b){
        this.sideA = a;
        this.sideB = b;
    }
    public int recArea(){
        return sideA * sideB;
    }
    public int recPeri(){
        return 2 * (sideA + sideB);
    }
    public void setA(int a){
        this.sideA = a;
    }
    public void setB(int b){
        this.sideB = b;
    }
    public int getA(){
        return sideA;
    }
    public int getB(){
        return sideB;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(int a , int b , int h){
        super(a , b);
        this.height = h;
    }
    public int cuboidArea(){
        return 2 * (sideA * sideB + sideB * height + sideA * height);
    }
    public int cuboidVolume(){
        return sideA * sideB * height;
    }
    public void setH(int h){
        this.height = h;
    }
    public int getH(){
        return height;
    }
}


public class CWH_51_PS {
    public static void main(String[] args) {
        //Question 1
        Circle cir = new Circle(5);
        Cylinder cyl = new Cylinder(5 , 6);
        System.out.println(cyl.circleArea());

        //Question 2

        Rectangle rec = new Rectangle();
        Cuboid cuboid = new Cuboid(5 , 6 , 7);

    }
}
