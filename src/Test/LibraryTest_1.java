package Test;

class Library{
    public Library(){
        System.out.println("The name and the book codes are :-\n" +
                "Let us C = 0 to 4\n" +
                "Programming in Java = 5 to 9\n" +
                "Digital Design = 10 to 14\n" +
                "Spherical Astronomy = 15 to 19\n" +
                "Calculus = 19 to 24\n");
        System.out.println("Each book has five copies");
    }
    int[] shelf = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};

    public void showAvailableBooks(){
        for (int e : shelf){
            System.out.println(e);
        }
    }
    public void issueBook(int ib){

        for (int i = 0 ; i <= shelf.length; i++ ){
            if ( shelf[i] == ib){
                shelf[i] = 100;
                break;
            }
        }

        System.out.println("Code of the issued book is:-" + ib);
    }

    public void returnBook(int rb){

        for(int i = 0; i <= shelf.length ; i++){
            if(i == 100){
                shelf[i] = rb;
                break;
            }
        }

        System.out.println("Code of the book returned is:-" + rb);

    }
    public String addBook(String ab){
        System.out.println("Name of the book to be added is:-");
        return ab;
    }
}
public class LibraryTest_1 {
    public static void main(String[] args) {
        Library Current = new Library();

            Current.showAvailableBooks();
            Current.issueBook(5);
            Current.showAvailableBooks();
            Current.returnBook(5);
            Current.showAvailableBooks();

    }
}
