import java.util.ArrayList;

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        char[] prefix = A.get(0).toCharArray();
        int prefixInt = prefix.length - 1;
        for (int i = 1; i < A.size(); i++) {
            char[] currentPrefix = A.get(i).toCharArray();
            for (int j = 0; j <= prefixInt; j++) {
                if (currentPrefix.length - 1 < j || prefix[j] != currentPrefix[j]) {
                    prefixInt = j - 1;
                    break;
                }
            }
        }
        String result = "";
        for (int i = 0; i <= prefixInt; i++) {
            result += prefix[i];
        }
        return result;
    }
}
