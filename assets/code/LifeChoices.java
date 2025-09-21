import java.util.Scanner;

public class LifeChoices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        long[][] n = new long[tc][4];
        for (int t = 0; t < tc; t++) {
            n[t][0] = sc.nextLong();
            n[t][1] = sc.nextLong();
            n[t][2] = sc.nextLong();
            n[t][3] = sc.nextLong();

        }
        for (int t = 0; t < tc; t++) {
            long a = n[t][0];
            long b = n[t][1];
            long x = n[t][2];
            long y = n[t][3];

            long cost = 0L;
            if (a > b) {
                if (a - b == 1 && a % 2 != 0) {
                    cost = y;
                } else {
                    cost = -1L;
                }
            } else {
                while (a != b) {
                    if (a % 2 == 0) {
                        if (y < x) {
                            a ^= 1;
                            cost += y;
                        } else {
                            a += 1;
                            cost += x;
                        }
                    } else {
                        a += 1;
                        cost += x;
                    }
                }
            }
            System.out.println(cost);

        }
    }
}