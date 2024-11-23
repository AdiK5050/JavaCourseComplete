package Test;

class Library1{

        String[] Books = {"Physics - 0" , "Chemistry - 1" , "Maths - 2" , "Biology - 3" , "English - 4" ,
                            "Hindi - 5" , "Economics - 6" , "Phy Edu - 7" , "History - 8" , "Civics - 9" };

    public Library1(){
        System.out.println("The Number of books available are shown below:-");
        System.out.println("The Book are all assigned codes from 0 to 10");
        for (String e : Books){
            System.out.println(e);
        }
    }
}

public class Library_Test_2 {
}
