import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class BowlingBalls {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        List<String> inputLines = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            inputLines.add(line);
        }
        input.close();
        int testcases = Integer.parseInt(inputLines.get(0));

        for (int t = 0; t < testcases; t++) {
            String[] parameters = inputLines.get(t * 2 + 1).split(" ");
            String[] ballsString = inputLines.get(t * 2 + 2).split(" ");
            int[] balls = new int[ballsString.length];

            for (int i = 0; i < ballsString.length; i++) {
                balls[i] = Integer.parseInt(ballsString[i]);
            }

            int n = Integer.parseInt(parameters[0]);
            int x = Integer.parseInt(parameters[1]);
            int y = Integer.parseInt(parameters[2]);

            List<Integer> availableBalls = Arrays.stream(balls).filter(ball -> ball >= x && ball <= y).boxed()
                    .collect(Collectors.toList());
            System.out.println(availableBalls.size());
        }

    }
}
