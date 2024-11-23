package CWH_CH_10;

class newBase {

    newBase(){
        System.out.println("I am a constructor");
    }
    newBase(int a){
        System.out.println("I am an overloaded constructor " + a);
    }
}
class newDerived extends newBase {
    newDerived() {
        super(5);
        System.out.println("I am a derived class constructor");
    }
    newDerived(int a , int b){
        super(a);
        System.out.println("I am an overloaded constructor of derived class " + b);
    }
}

class childOfDerived extends newDerived{
    childOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    childOfDerived(int a , int b , int c){
        super (a , b );
        System.out.println("I am an overloaded child constructor of childOfDerived class " + c);
    }
}
public class CWH_46_CONS_IN_INHERITANCE {
    public static void main(String[] args) {

        newBase b = new newBase();
        newDerived d = new newDerived();
        newDerived d1 = new newDerived(5 , 8);
        childOfDerived c1 = new childOfDerived();
        childOfDerived c2 = new childOfDerived(1 , 2 , 3);
    }
}
