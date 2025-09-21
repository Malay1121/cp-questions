public class Solution {
    public int DecimalToAnyBase(int A, int B) {
        if (A == 0) {
            return 0;
        }
        int result = 0;
        int power = 1;
        while (A > 0) {
            result += (A % B) * power;
            A /= B;
            power *= 10;
        }
        return result;
    }
}