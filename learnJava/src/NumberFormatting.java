import java.text.NumberFormat;
import java.util.Currency;

public class NumberFormatting {
    public static void main(String[] args){

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percentage = NumberFormat.getPercentInstance();

        String currencyResult = currency.format(231412314.3241723);
        String percentageResult = percentage.format(0.1);

        System.out.println(currencyResult);
        System.out.println(percentageResult);
    }
}
