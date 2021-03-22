public class ForEachLoop {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 50, 32 ,33};

        // For each element n of array arr
        for (int n : arr){
            System.out.println(n);
        }

        String str = "Hello world";
        char[] chr = str.toCharArray();

        for (char m : chr){
            System.out.println(m);
        }
    }
}
