import java.util.Arrays;

public class ArraysJava {
    public static void main(String[] args){

        // Declaring an array
        int[] numbers = new int[5];
        // If we know the elements of array beforehand.
        int[] moreNumbers = {2, 8, 1, 3, 4, 4, 9, 11, 2};

        int[][] multidimensionalArray = new int[2][3];  // Array with 2 rows and 3 columns.

        multidimensionalArray[0][0] = 1;

        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers.length);
        System.out.println(moreNumbers.length);

        Arrays.sort(moreNumbers);

        System.out.println(Arrays.toString(numbers));   // printing normal arrays
        System.out.println(Arrays.toString(moreNumbers));

        System.out.print(Arrays.deepToString(multidimensionalArray));   // printing multidimensional array

    }
}
