public class Solution {
    public String longestPalindrome(String A) {
        char[] a = A.toCharArray();
        int maxStart = 0, maxLen = 1;

        for (int i = 0; i < a.length; i++) {
            int left = i;
            int right = i;
            int len = 0;
            while (left >= 0 && right < a.length) {
                if (a[left] != a[right]) {
                    break;
                }
                len = right - left + 1;
                left--;
                right++;
            }

            if (maxLen < len) {
                maxLen = len;
                maxStart = left + 1;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < a.length) {
                if (a[left] != a[right]) {
                    break;
                }
                len = right - left + 1;
                left--;
                right++;
            }
            if (maxLen < len) {
                maxLen = len;
                maxStart = left + 1;
            }
        }
        return A.substring(maxStart, maxStart + maxLen);
    }
}
