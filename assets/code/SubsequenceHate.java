import java.util.*;

public class SubsequenceHate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            int[] ones = new int[n + 1];
            int[] zeros = new int[n + 1];
            for (int i = 0; i < n; i++) {
                ones[i + 1] = ones[i] + (s.charAt(i) == '1' ? 1 : 0);
                zeros[i + 1] = zeros[i] + (s.charAt(i) == '0' ? 1 : 0);
            }
            int minOps = Math.min(ones[n], zeros[n]);
            for (int i = 1; i < n; i++) {
                int ops1 = zeros[i] + (ones[n] - ones[i]);
                int ops2 = ones[i] + (zeros[n] - zeros[i]);
                minOps = Math.min(minOps, Math.min(ops1, ops2));
            }
            System.out.println(minOps);
        }
    }
}
