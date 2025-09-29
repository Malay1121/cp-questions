public class Solution {
    public int FirstIndex(ArrayList<Integer> A, int B) {
        return findFirst(A, B, 0);
    }

    private int findFirst(ArrayList<Integer> A, int B, int index) {
        if (index >= A.size()) {
            return -1;
        }
        if (A.get(index) == B) {
            return index;
        }
        return findFirst(A, B, index + 1);
    }
}
