package CWH_CH_12;

class typesOfModifiers{
    public int a = 5;
    protected int b = 55;
    int c = 555;                //this is default(no modifier)
    private int d = 5555;

    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
class showcasingMods extends typesOfModifiers{
    public void meth2(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //System.out.println(d);// private cannot be used in extended classes
        }
    }

public class CWH_66_ACCESS_MODIFIER {
    public static void main(String[] args) {

        typesOfModifiers ex = new typesOfModifiers();
        showcasingMods ex1 = new showcasingMods();
        //In same class we can use all of them
        ex.meth1();
        ex1.meth2();

        //Using variable with modifiers in main class
        System.out.println(ex.a);
        System.out.println(ex.b);
        System.out.println(ex.c);
        //System.out.println(ex.d);//cannot use private in another class in the same "PACKAGE"
    }
}
