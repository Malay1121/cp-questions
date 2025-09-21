import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner inp = new Scanner(System.in);
        String[] splitted = inp.nextLine().split(" ");
        int a = Integer.parseInt(splitted[0]);
        int b = Integer.parseInt(splitted[1]);
        int c = Integer.parseInt(splitted[2]);
        if (a == b && b == c) {
            System.out.println("equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}