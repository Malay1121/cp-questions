public class Solution {
    public int solve(int A, int B) {
        if ((A & (1 << B)) != 0) {
            A = (A ^ (1 << B));
        } else {
            A = (A | (1 << B));
        }
        return A;
    }
}
