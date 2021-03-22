import java.util.Scanner;

public class CharWrap {
    public static void main(String[] args) {
        char myChar;

        System.out.println("Enter character : ");
        Scanner scanner = new Scanner(System.in);

        myChar = scanner.next().charAt(0);

        if (Character.isUpperCase(myChar))
            System.out.println(myChar + " is upper case.");
        else
            System.out.println(myChar + " is lower case.");
    }
}

class CharToString {
    public static void main(String[] args){
        String str;
        char newChar = 'a';

        str = Character.toString(newChar);
        System.out.println(str);
    }
}