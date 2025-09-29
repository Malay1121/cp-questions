import java.util.ArrayList;

public class Solution {
    public String solve(String A) {
        String concatenatedString = A + A;
        char[] splitted = concatenatedString.toCharArray();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i] >= 65 && splitted[i] <= 90) {

            } else if (splitted[i] == 97 || splitted[i] == 101 || splitted[i] == 105 || splitted[i] == 111
                    || splitted[i] == 117) {
                output.append("#");
            } else {
                output.append(splitted[i]);
            }
        }
        return output.toString();
    }
}
