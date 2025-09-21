import java.util.Scanner;

public class GameOfPrefixSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] output = new int[tc];
        for (int t = 0; t < tc; t++) {
            int nc = sc.nextInt();
            int[] n = new int[nc];
            for (int i = 0; i < nc; i++) {
                n[i] = sc.nextInt();
            }
            int mc = sc.nextInt();

            int[] m = new int[mc];
            for (int i = 0; i < mc; i++) {
                m[i] = sc.nextInt();
            }
            int max = nc + mc - 2;
            int sum = 0;
            int maxSum = 0;
            int mind = 0;
            int nind = 0;
            while (mind + nind <= max) {
                System.out.println(t + " " + nind + " " + mind);
                if (nind == nc - 1 || mind == mc - 1) {
                    if (nind == nc - 1) {
                        sum += m[mind];
                        mind++;
                    } else {
                        sum += n[nind];
                        nind++;
                    }
                } else {
                    if (n[nind] > m[mind]) {
                        sum += n[nind];
                        nind++;
                    } else {
                        sum += m[mind];
                        mind++;
                    }
                }
                System.out.println(sum);

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            output[t] = maxSum;

        }
        for (int out : output) {
            System.out.println(out);
        }
    }
}
