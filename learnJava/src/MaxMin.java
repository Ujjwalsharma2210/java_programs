import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 5;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1 || arr[i] % 3 == 0) {
                System.out.println(arr[i]);
                break;
            }
        }

        for (int j = n-1; j >= 0; j--) {
            if (arr[j] % 2 == 0) {
                System.out.println(arr[j]);
                break;
            }
        }

    }
}