public class Solution {
    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(A, 1, 3, 2, result);
        return result;
    }

    private void solve(int n, int start, int end, int aux, ArrayList<ArrayList<Integer>> result) {
        if (n == 0) {
            return;
        }
        solve(n - 1, start, aux, end, result);
        ArrayList<Integer> move = new ArrayList<>();
        move.add(n);
        move.add(start);
        move.add(end);
        result.add(move);
        solve(n - 1, aux, end, start, result);
    }
}
