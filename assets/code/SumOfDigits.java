import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);

        int A = scn.nextInt();
        System.out.println(sumOfDigits(A, 0));
    }

    static int sumOfDigits(int N, int sum) {
        if (N == 0) {
            return sum;
        }

        sum += N % 10;
        return sumOfDigits(N / 10, sum);
    }
}