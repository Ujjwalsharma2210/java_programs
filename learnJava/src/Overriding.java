public class Overriding {
    public static void sayHi(){System.out.println("Hi!");}
}

class Overriden extends Overriding {

    public static void sayHi() {
        System.out.println("Hi from b");
    }

}

class Main {

    public static void main(String[] args) {

        Overriden n = new Overriden();

        n.sayHi();
    }

}
