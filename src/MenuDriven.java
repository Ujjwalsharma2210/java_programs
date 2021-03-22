import java.text.NumberFormat;
import java.util.Scanner;

public class MenuDriven {

    public static final Scanner scan = new Scanner(System.in);
    public static final NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
    
    public static void main(String[] args){

        System.out.println("MATURITY AMOUNT CALCULATOR");

        System.out.println("Enter : \n" +
                           "1 if you have a term Deposit\n" +
                           "2 if you have a Recurring Deposit");

        int choice = scan.nextInt();

        switch (choice){
            case 1:
                termDeposit();
                break;
            case 2:
                recurringDeposit();
                break;
        }
    }

    static void recurringDeposit() {

        System.out.println("Enter monthly installment : ");
        int monthlyInstallment, p = scan.nextInt();

        System.out.println("Enter Rate of interest : ");
        float rateOfInterest, r = scan.nextFloat();

        System.out.println("Enter time period in months : ");
        int timePeriod, n = scan.nextInt();

        float maturityAmount = p * n + p * n * (n + 1) / 2 * r / 100 / 12;

        System.out.println("Your amount Receivable is : " + numberFormat.format(maturityAmount));

    }

    static void termDeposit() {

        System.out.println("Enter principal amount : ");
        float principal = scan.nextFloat();

        System.out.println("Enter Rate of interest : ");
        float rateOfInterest = scan.nextFloat();

        System.out.println("Enter time period in years : ");
        int timePeriod = scan.nextInt();

        float maturityAmount = principal * (1+(rateOfInterest/100)) * timePeriod;

        System.out.println("Your amount receivable is : " + numberFormat.format(maturityAmount));
    }
}
