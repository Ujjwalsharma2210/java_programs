import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args){

        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal amount : ");
        int principal = scanner.nextInt();

        System.out.println("Annual rate of interest : ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent / monthsInYear;

        System.out.println("Period in years : ");
        int timePeriod = scanner.nextInt();
        int numberOfPayments = timePeriod * monthsInYear;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String formattedMortgage = formatter.format(mortgage);

        System.out.println("Mortgage : " + formattedMortgage);

    }
}
