import java.util.Scanner;

public class ProtecctYourLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] n = new int[len];
        int maxLength = 1;
        int length = 1;

        for (int i = 0; i < len; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 1; i < len; i++) {
            if (n[i] > n[i - 1]) {
                length += 1;
            } else {
                length = 1;
            }
            if (maxLength < length) {
                maxLength = length;
            }
        }

        System.out.println(maxLength);

    }
}
