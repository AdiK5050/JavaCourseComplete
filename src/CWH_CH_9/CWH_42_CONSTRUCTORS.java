package CWH_CH_9;

class MyMainEmployee{
    private int id;
    private String name;

    //Setting constructors;
    public MyMainEmployee(){
        id = 0;
        name = "This is default if no name and id is set in the Main class";
    }

    //We can pass arguments too;
    public MyMainEmployee(int myId, String myName){
        id = myId;
        name = myName;
    }

    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}

public class CWH_42_CONSTRUCTORS {
    public static void main(String[] args) {

        MyMainEmployee Aditya = new MyMainEmployee(1 , "Aditya is the best");
        MyMainEmployee NoOne = new MyMainEmployee();
//        Aditya.setName("Aditya Kumar Gupta");
//        Aditya.setId(1);
        System.out.println(Aditya.getName());
        System.out.println(Aditya.getId());
        System.out.println(NoOne.getId());
        System.out.println(NoOne.getName());
    }
}
