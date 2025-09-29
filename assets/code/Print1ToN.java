import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        OneToN(N);
    }

    public static int OneToN(int N) {
        if (N == 0) {
            return 0;
        } else {

            int A = OneToN(N - 1);
            System.out.print(A + 1 + " ");
            return N;
        }
    }
}