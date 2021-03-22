import java.util.Scanner;

public class FlipZero {

    public static void main(String[] k) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String strNum = Integer.toString(num);

        String str1 = "";

        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.charAt(i) == '0') {
                str1 = str1 + "1";
            }else {
                str1 = str1 + strNum.charAt(i);
            }
        }

        System.out.println(str1);

        scan.close();
    }
}
