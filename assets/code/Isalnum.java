public class Solution {
    public int solve(ArrayList<Character> A) {
        int isAlpha = 1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) >= 65 && A.get(i) <= 90) {

            } else if (A.get(i) >= 97 && A.get(i) <= 122) {

            } else if (A.get(i) >= 48 && A.get(i) <= 57) {

            } else {
                isAlpha = 0;
            }
        }
        return isAlpha;
    }
}
