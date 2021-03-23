import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Age : ");
        byte age = scan.nextByte();

        System.out.print("Name : ");
        String name = scan.next();

        System.out.println("You are " + name + " of age : " + age);
    }
}
