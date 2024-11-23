package CWH_CH_9;

class MyEmployee{
    //Changing into private access modifier;
    private int id;
    private String name;
    //using private access modifiers through methods;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
}

public class CWH_40_ACCESS_MODIFIER {
    public static void main(String[] args) {

        MyEmployee Aditya = new MyEmployee();
        //this will work when not private access modifiers are used;
//        Aditya.id = 1;
//        Aditya.name = "Aditya Kumar Gupta"; //--> throws error cuz int id and string name are now private

        Aditya.setName("Aditya Kumar Gupta");
        System.out.println(Aditya.getName());
        Aditya.setId(1);
        System.out.println(Aditya.getId());
    }
}
