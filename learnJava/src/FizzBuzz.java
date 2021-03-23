import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number : ");
        int num = scan.nextInt();

        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("fizzbuzz");
        else if (num % 5 == 0)
            System.out.println("buzz");
        else if (num % 3 == 0)
            System.out.println("buzz");
        else
            System.out.println(num);
    }
}
