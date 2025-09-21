public class Solution {
    public int singleNumber(final List<Integer> A) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < A.size(); j++) {
                if ((A.get(j) >> i & 1) == 1) {
                    count++;
                }
            }
            result |= (count % 3) << i;
        }
        return result;
    }
}