import java.util.Scanner;

public class VarunsGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        long[] n = new long[len];
        long sum = 0L;
        long maxSum = Long.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            n[i] = sc.nextLong();
        }

        for (int i = 0; i < len; i++) {
            sum += n[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0L;
            }

        }
        System.out.print(maxSum);
    }
}
