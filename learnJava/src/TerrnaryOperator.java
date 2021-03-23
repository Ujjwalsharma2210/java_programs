public class TerrnaryOperator {
    public static void main(String[] args){
        int income = 120_000;

        // ? is the ternary operator
        // if income is greater than 100,000 set class name to first else set class name to economy
        String className = income > 100_000 ? "First" : "economy";

        System.out.println(className);
    }
}
