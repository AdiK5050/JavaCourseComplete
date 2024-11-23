package CWH_CH_3;

public class CWH_14_String_Methods {
    public static void main(String[] args) {
        String Name = "Aaditya";
        System.out.println(Name);
        float value = Name.length();
        System.out.println(value);
        String ToLowerCase = Name.toLowerCase();
        String ToUpperCase = Name.toUpperCase();
        System.out.println(ToLowerCase);
        System.out.println(ToUpperCase);
        String nonTrimmedString = "     Aditya     ";
        System.out.println(nonTrimmedString);
        String trimmedString= nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(Name.substring(4));
        System.out.println(Name.substring(2,6));
        System.out.println(Name.replace('a','Q'));
        System.out.println(Name.replace("ya","i"));
        System.out.println(Name.startsWith("Adi"));
        System.out.println(Name.endsWith("ya"));
        System.out.println(Name.charAt(4));
        System.out.println(Name.indexOf("ya"));
        System.out.println(Name.indexOf("p" , 3));// -1 will be returned if not found the data
        System.out.println(Name.lastIndexOf("a"));
        System.out.println(Name.lastIndexOf("a" , 4));
        System.out.println(Name.equalsIgnoreCase("Aaditya"));
        System.out.println(Name.equalsIgnoreCase("aAdiTyA"));
        //Escape Sequence Characters
        System.out.println("Using this \" because i can ");
        System.out.println("Using this \t because i can");
        System.out.println("Using this\nbecause I can");
        System.out.println("This uses backspace e\b like this");
        System.out.println("Trying this one \r cuz why not");
        System.out.println("Trying this one \f cuz why not");
        System.out.println("Trying this one \\ cuz why not");
    }
}
