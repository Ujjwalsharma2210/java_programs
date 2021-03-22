import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        // Declaring an array of type int and name myArray.
        int[] myArray;
        // allocating memory to the array myArray.
        myArray = new int[5];
        Scanner scan = new Scanner(System.in);

        // Taking data into array
        int i;
        System.out.println("Enter values of array");
        for (i=0; i < myArray.length; i++){
            myArray[i] = scan.nextInt();
        }

        for (i=0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
