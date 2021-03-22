import java.util.Scanner;
import java.util.Random;

class averageFilter{
    public static void main(String[] args){

        int r1 = 100, c1 = 100;
        int r2 = 3, c2 = 3;
        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];

        Scanner scan = new Scanner(System.in);

        // Takes a 3*3 array named arr2 as input.
        for(int k =0; k<r2; k++) {
            for (int l = 0; l < c2; l++) {
                arr2[k][l] = scan.nextInt();
            }
        }

        Random rand = new Random();

        // Creates an array of 100 by 100 with 1 as each element.
        for(int a =0; a<r1; a++) {
            for (int b = 0; b < c1; b++) {
                int randInt = rand.nextInt(10);
                arr1[a][b] = randInt;
            }
        }

        // Assigns the average value of the surrounding elements to the middle.
        for(int x=1; x<r1; x++){
            for(int y=1; y<c1; y++){
                int averageOfMat = (arr1[x-1][y-1] + arr1[x-1][y-1] +
                                   arr1[x-1][y-1] + arr1[x-1][y-1] +
                                   arr1[x-1][y-1] +  arr1[x-1][y-1] +
                                   arr1[x-1][y-1] +  arr1[x-1][y-1] +
                                   arr1[x][y]) / 9;
                arr1[x][y] = averageOfMat;
            }
        }

        System.out.println("output matrix : ");

        int lineCount = 0;
        for(int []x:arr1){
            for(int y:x){
                System.out.print(y+"   ");
            }
            System.out.println();
            lineCount += 1;
        }
        System.out.println();
        System.out.print(lineCount);

    }
}