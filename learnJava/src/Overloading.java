public class Overloading {
    public static void sayHi() {
        System.out.println("Hi");
    }

    public static void sayHi(String str) {
        System.out.println("Hi " + str);
    }

    public static void main(String[] args) {
        sayHi();
        sayHi("Ujjwal");
    }
}
