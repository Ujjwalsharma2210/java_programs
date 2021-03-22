import java.util.Scanner;
import java.util.Arrays;

public class ZigZagArr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array length : ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int j = 0; j < n; j++) {
            arr[j] = scan.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
