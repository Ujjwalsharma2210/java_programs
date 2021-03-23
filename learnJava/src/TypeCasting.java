public class TypeCasting {
    public static void main(String[] args){
        // Implicit casting done by java
        short x = 1;
        int y = 2;
        int z = x + y;
        String b = "2";

        double i = z + 20;
        // Here, Java converts the short variable to int and then adds the numbers
        // byte(1) < short(2) < int(4) < long(8)    in 64-bit system
        int a = (int)i + 2;
        int t = Integer.parseInt(b) + 2;

        System.out.println(z);
        System.out.println(i);
        System.out.println(a);
        System.out.println(t);
    }
}
