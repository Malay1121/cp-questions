import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> inputLines = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            inputLines.add(line);
        }
        input.close();
        int x = 0;
        int y = 0;
        int z = 0;
        int testcases = Integer.parseInt(inputLines.get(0));
        for (int t = 0; t < testcases; t++) {
            String[] numbersString = inputLines.get(t + 1).split(" ");
            int[] numbers = new int[numbersString.length];
            for (int i = 0; i < numbersString.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
            }
            x += numbers[0];
            y += numbers[1];
            z += numbers[2];
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}