public class Solution {
    public int solve(int A, int B) {
        int i = 0;
        i = (i | (1 << A));
        i = (i | (1 << B));
        return i;
    }
}
