package CWH_CH_10;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and I am setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println(" I am in Derived and I am setting y now");
        this.y = y;
    }
}
public class CWH_45_INHERITANCE {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        // We can access x from derived class too
        Derived d = new Derived();
        d.setX(6);
        System.out.println(d.getX());
        d.setY(7);
        System.out.println(d.getY());
    }
}
