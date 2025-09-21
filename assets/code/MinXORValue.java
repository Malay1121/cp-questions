import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int minXor = Integer.MAX_VALUE;
        for (int i = 0; i < A.size() - 1; i++) {
            int xor = A.get(i) ^ A.get(i + 1);
            if (xor < minXor) {
                minXor = xor;
            }
        }
        return minXor;
    }
}
