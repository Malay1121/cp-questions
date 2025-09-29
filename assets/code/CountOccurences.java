public class Solution {
    public int solve(String A) {
        char[] splitted = A.toCharArray();
        int count = 0;

        for (int i = 0; i < splitted.length - 2; i++) {
            if ((String.valueOf(splitted[i]) + String.valueOf(splitted[i + 1]) + String.valueOf(splitted[i + 2]))
                    .equals("bob")) {
                count++;
            }
        }
        return count;
    }
}
