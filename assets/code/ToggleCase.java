public class Solution {
    public String solve(String A) {
        char[] splitted = A.toCharArray();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i] >= 65 && splitted[i] <= 90) {
                output.append((char) (splitted[i] + 32));
            } else {
                output.append((char) (splitted[i] - 32));
            }
        }
        return output.toString();
    }
}
