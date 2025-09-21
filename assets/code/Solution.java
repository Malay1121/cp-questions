import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int n = inp.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < n; i += 2) {
                sb.append(arr[i]).append(" ").append(arr[i - 1]).append(" ");
            }
            if (n % 2 == 1) {
                sb.append(arr[n - 1]);
            }
            System.out.println(sb.toString().trim());
        }
        inp.close();
    }
}