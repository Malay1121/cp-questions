public class Solution {
    public int solve(int A) {
        if (A <= 9) {
            if (A == 1) {
                return 1;
            } else {
                return 0;
            }
        }
        int temp = A;
        int sum = 0;
        while (temp != 0) {
            sum += (temp % 10);
            temp /= 10;
        }
        return solve(sum);
    }
}
