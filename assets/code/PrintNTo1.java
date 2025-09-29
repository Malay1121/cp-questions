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
        NTo1(N);
    }

    public static int NTo1(int N) {
        if (N == 0) {
            return 0;
        } else {

            System.out.print(N + " ");
            return NTo1(N - 1);
        }
    }
}