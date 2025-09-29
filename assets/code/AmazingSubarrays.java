public class Solution {
    public int solve(String A) {
        char[] splitted = A.toCharArray();
        long count = 0;

        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i] == 'A' || splitted[i] == 'E' || splitted[i] == 'I' || splitted[i] == 'O'
                    || splitted[i] == 'U' || splitted[i] == 'a' || splitted[i] == 'e' || splitted[i] == 'i'
                    || splitted[i] == 'o' || splitted[i] == 'u') {
                count += splitted.length - i;
            }
        }
        return (int) (count % 10003);
    }
}
