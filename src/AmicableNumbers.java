import java.util.Scanner;

public class AmicableNumbers {

    public static void main(String[] args) {

        int a, b;
        int suma = 0, sumb = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers to be checked for amicableness : ");
        a = scan.nextInt();
        b = scan.nextInt();

        for (int i=1; i<=a; i++) {
            if (i % a == 0) {
                suma = suma + i;
            }
        }

        for (int j=1; j<=b; j++) {
            if (j % a == 0) {
                sumb = sumb + j;
            }
        }

        if (suma == sumb) {
            System.out.println("Numbers are amicable.");
        }else {
            System.out.println("Numbers are not amicable.");
        }
    }
}
