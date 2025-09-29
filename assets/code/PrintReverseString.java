import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        String A = scn.nextLine();
        reverse(A);
    }

    public static void reverse(String A) {
        if (A.length() > 0) {
            System.out.print(A.substring(A.length() - 1, A.length()));
            reverse(A.substring(0, A.length() - 1));
        } else {
            return;
        }
    }
}