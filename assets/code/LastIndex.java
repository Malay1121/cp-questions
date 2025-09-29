public class Solution {
    public int LastIndex(ArrayList<Integer> A, int B) {
        return findLast(A, B, A.size() - 1);
    }

    private int findLast(ArrayList<Integer> A, int B, int index) {
        if (index < 0) {
            return -1;
        }
        if (A.get(index) == B) {
            return index;
        }
        return findLast(A, B, index - 1);
    }
}
