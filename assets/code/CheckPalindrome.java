public class Solution {
    public int solve(String A) {
        char[] splitted = A.toCharArray();
        if (splitted.length == 1 || splitted.length == 0) {
            return 1;
        }
        if (splitted[0] != splitted[splitted.length - 1]) {
            return 0;
        } else {
            return solve(A.substring(1, splitted.length - 1));
        }
    }
}
