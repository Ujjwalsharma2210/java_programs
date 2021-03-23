public class MathClass {
    public static void main(String[] args){

        int rounded = Math.round(1.1f);     // rounds off the number to closest integer
        int ceiling = (int)Math.ceil(1.1f);     // rounds off to greater integer
        int flooring = (int)Math.floor(1.1f);   // rounds off to smaller integer
        int greater = Math.max(56, 22);     // returns greater of the two integers
        double randomNumber = Math.random();    // returns a random number between 0 and 1 with double data type.
        int randRange = (int) (Math.random() * 100);    // returns a random number between 1 and 100

        System.out.println(rounded);
        System.out.println(ceiling);
        System.out.println(flooring);
        System.out.println(greater);
        System.out.println(randomNumber);
        System.out.println(randRange);
    }
}
